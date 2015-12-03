package maxim.zaks.generator

import maxim.zaks.flatBuffers.*

class CSharpGenerator {
	
	var rootTableName = "";
	
	String nameSpace
	
	String fileIdentifier
	
	public def generate(Schema schema) {
		rootTableName = schema.rootType.type.name
		nameSpace = schema.namepsace?.name
		fileIdentifier = schema.fileIdentifier
		'''
			«IF nameSpace!=null»
			namespace «nameSpace» {
			«ENDIF»	
			
			using FlatBuffers;
			
			«FOR table : schema.tables»
			«table.tableStructReader»
			«ENDFOR»
			
			«IF nameSpace!=null»
			}
			«ENDIF»
		'''
	}
	
	def tableStructReader(Table table) '''
		public sealed class «table.name» : Table {
			«FOR p : table.fields.indexed.map[tableStructFieldReader(it.value, it.key)]»
			«p»
			«ENDFOR»
			
			«table.makeMethod»
			
			«table.buildMethod»
		}
	'''
	
	def tableStructFieldReader(Fields field, int index) {
		'''	
		public «field.type.generateFieldType» «field.name»;
		'''
	}
	
	def makeMethod(Table table){
		var rootMakeMethod = ''''''
		if(table.name == rootTableName){
			rootMakeMethod ='''
			public static «table.name» Make(byte[] data) {
				«table.name» obj = new «table.name»();
				obj.bb = new ByteBuffer(data);
				obj.bb_pos = obj.bb.GetInt(obj.bb.Position) + obj.bb.Position; 
				
				«FOR p : table.fields.indexed.map[initFields(it.value, it.key)]»
				«p»
				«ENDFOR»
				return obj;
			}
			'''
		}
		rootMakeMethod + '''
		internal static «table.name» _Make(ByteBuffer _bb, int pos) {
			«table.name» obj = new «table.name»();
			
			obj.bb_pos = pos; 
			obj.bb = _bb;
			
			«FOR p : table.fields.indexed.map[initFields(it.value, it.key)]»
			«p»
			«ENDFOR»
			return obj;
		}
		'''
	}
	
	def initFields(Fields field, int index) {
		if(field.type.primType != null){
			if(field.type.primType == "string"){
				'''	
				int o«index» = obj.__offset(4 + 2*«index»); 
				obj.«field.name» =  o«index» != 0 ? obj.__string(o«index» + obj.bb_pos) : null;
				'''
			} else {
				'''	
				int o«index» = obj.__offset(4 + 2*«index»); 
				obj.«field.name» =  o«index» != 0 ? obj.bb.«field.type.primType.converPrimitiveTypeGetter»(o«index» + obj.bb_pos) : («field.type.primType.converPrimitiveType»)«field.defaultValueString»;
				'''
			}
		} else if(field.type.tableType != null){
			'''	
				int o«index» = obj.__offset(4 + 2*«index»); 
				obj.«field.name» =  o«index» != 0 ? «field.type.tableType.type.name»._Make(obj.bb, obj.__indirect(o«index» + obj.bb_pos)) : null;
				'''
		} else if(field.type.vectorType != null){
			val LengthStatement = '''
				 int o«index» =obj. __offset(4 + 2*«index»);
				 int length«index» = o«index» != 0 ? obj.__vector_len(o«index») : 0;
				 obj.«field.name» = new «field.type.vectorType.generateVectorType»[length«index»];
			'''
			if(field.type.vectorType.primType != null){
				
				if(field.type.vectorType.primType.equals("string")){
					return LengthStatement + '''
					for (int j = length«index»-1; j >=0; j-- ){
						obj.«field.name»[j] = obj.__string(obj.__vector(o«index») + j * 4);
					}
					'''
				}else {
					return LengthStatement + '''
					for (int j = length«index»-1; j >=0; j-- ){
						obj.«field.name»[j] = obj.bb.«field.type.vectorType.primType.converPrimitiveTypeGetter»(obj.__vector(o«index») + j * 4);
					}
					'''
				}
			} else {
				return LengthStatement + '''
				for (int j = length«index»-1; j >=0; j-- ){
					obj.«field.name»[j] = «field.type.vectorType.tableType.type.name»._Make(obj.bb, obj.__indirect(obj.__vector(o«index») + j * 4));
				}
				'''
			}
		}
	}
	
	def buildMethod(Table table){
		var rootBuild = ''''''
		if(table.name == rootTableName){
			var finishCall = '''builder.Finish(offset.Value);'''
			if(fileIdentifier != null){
				finishCall = '''builder.Finish(offset.Value, «fileIdentifier»);'''
			}
			rootBuild = '''
			public byte[] Build(){
				FlatBufferBuilder builder = new FlatBufferBuilder(1);
				var offset = this._Build(builder);
				«finishCall»
				return builder.SizedByteArray();
			}
			'''
		}
		rootBuild + '''
			internal Offset<«table.name»> _Build(FlatBufferBuilder builder){
				
				«FOR p : table.fields.indexed.map[buildChildren(it.value, it.key)]»
				«p»
				«ENDFOR»
				
				builder.StartObject(«table.fields.length»);
				
				«FOR p : table.fields.indexed.map[addChildren(it.value, it.key)]»
				«p»
				«ENDFOR»
				
				int o = builder.EndObject();
				return new Offset<«table.name»>(o);
			}
		'''
	}
	
	def buildChildren(Fields field, int index){
		if(field.type.primType != null && field.type.primType == "string"){
			'''
				StringOffset offset«index» = this.«field.name» == null ? default(StringOffset) : builder.CreateString(this.«field.name»);
			'''
		} else if(field.type.tableType != null){
			val typeName = field.type.tableType.type.name
			'''
				Offset<«typeName»> offset«index» = this.«field.name» == null ? default(Offset<«typeName»>) : this.«field.name»._Build(builder);
			'''
		} else if(field.type.vectorType != null){
			'''
				VectorOffset offset«index»;
				if(this.«field.name» == null) {
					offset«index» = default(VectorOffset);
				} else {
					«field.type.vectorType.buildVector(field, index)»
				}
			'''
		}
	}
	
	def buildVector(Vector vector, Fields field, int index){
		if(vector.primType != null){
			if(vector.primType != "string"){
				val length = vector.primType.converPrimitiveTypeToLength
				'''
				builder.StartVector(«length», this.«field.name».Length, «length»);
				for (int i = this.«field.name».Length - 1; i >= 0; i--) {
					builder.«vector.primType.converPrimitiveTypeAdd»(this.«field.name»[i]);
				} 
				offset«index» = builder.EndVector();
				'''
			} else {
				'''
				StringOffset[] data = new StringOffset[this.«field.name».Length];
				for (int i = this.«field.name».Length - 1; i >= 0; i--) {
					data[i] = builder.CreateString(this.«field.name»[i]);
				}
				builder.StartVector(4, this.«field.name».Length, 4);
				for (int i = data.Length - 1; i >= 0; i--) {
					builder.AddOffset(data[i].Value);
				} 
				offset«index» = builder.EndVector();
				'''
			}
			
		} else if(vector.tableType != null){
				val typeName = vector.tableType.type.name
				'''
				Offset<«typeName»>[] data = new Offset<«typeName»>[this.«field.name».Length];
				for (int i = this.«field.name».Length - 1; i >= 0; i--) {
					data[i] = this.«field.name»[i]._Build(builder);
				}
				builder.StartVector(4, this.«field.name».Length, 4);
				for (int i = data.Length - 1; i >= 0; i--) {
					builder.AddOffset(data[i].Value);
				} 
				offset«index» = builder.EndVector();
				'''
		}
	}
		
	
	def addChildren(Fields field, int index){
		if(field.type.primType != null){
			if(field.type.primType == "string"){
				'''
					builder.AddOffset(«index», offset«index».Value, 0);
				'''
			} else {
				'''
					builder.«field.type.primType.converPrimitiveTypeAdd»(«index», this.«field.name», («field.type.primType.converPrimitiveType»)«field.defaultValueString»);
				'''
			}
		} else {
			'''
				builder.AddOffset(«index», offset«index».Value, 0);
			'''
		}
	}
	
	def defaultValueString(Fields field){
		if(field.defaultValue == null){
			if(field.type.primType == "bool"){
				return "false"
			} else {
				return "0"
			}
		}
		return field.defaultValue
	}
	
	def generateFieldType(Type fieldType) {
		if(fieldType.primType != null){
			'''«fieldType.primType.converPrimitiveType»'''
		} else if(fieldType.tableType != null) {
			'''«fieldType.tableType.type.name»'''
		} else if(fieldType.vectorType != null) {
			'''«fieldType.vectorType.generateVectorType»[]'''
		}
	}
	
	def generateVectorType(Vector vectorType){
		if(vectorType.primType != null){
			'''«vectorType.primType.converPrimitiveType»'''
		}else if(vectorType.tableType != null){
			'''«vectorType.tableType.type.name»'''
		}
	}
	
	def converPrimitiveType(String type) {
		switch type {
			case 'bool' : '''bool'''
			case 'byte' : '''byte'''
			case 'ubyte' : '''ubyte'''
			case 'short' : '''short'''
			case 'ushort' : '''ushort'''
			case 'int' : '''int'''
			case 'uint' : '''uint'''
			case 'float' : '''float'''
			case 'long' : '''long'''
			case 'ulong' : '''ulong'''
			case 'double' : '''double'''
			case 'string' : '''string'''
		}
	}
	
	def converPrimitiveTypeGetter(String type) {
		switch type {
			case 'bool' : '''GetBool'''
			case 'byte' : '''GetByte'''
			case 'ubyte' : '''GetUbyte'''
			case 'short' : '''GetShort'''
			case 'ushort' : '''GetUshort'''
			case 'int' : '''GetInt'''
			case 'uint' : '''GetUint'''
			case 'float' : '''GetFloat'''
			case 'long' : '''GetLong'''
			case 'ulong' : '''GetUlong'''
			case 'double' : '''GetDouble'''
		}
	}
	
	def converPrimitiveTypeAdd(String type) {
		switch type {
			case 'bool' : '''AddBool'''
			case 'byte' : '''AddByte'''
			case 'ubyte' : '''AddUbyte'''
			case 'short' : '''AddShort'''
			case 'ushort' : '''AddUshort'''
			case 'int' : '''AddInt'''
			case 'uint' : '''AddUint'''
			case 'float' : '''AddFloat'''
			case 'long' : '''AddLong'''
			case 'ulong' : '''AddUlong'''
			case 'double' : '''AddDouble'''
		}
	}
	
	def converPrimitiveTypeToLength(String type) {
		switch type {
			case 'bool' : '''1'''
			case 'byte' : '''1'''
			case 'ubyte' : '''1'''
			case 'short' : '''2'''
			case 'ushort' : '''2'''
			case 'int' : '''4'''
			case 'uint' : '''4'''
			case 'float' : '''4'''
			case 'long' : '''8'''
			case 'ulong' : '''8'''
			case 'double' : '''8'''
		}
	}
}