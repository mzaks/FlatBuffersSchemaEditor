package maxim.zaks.generator

import maxim.zaks.flatBuffers.*
import java.util.HashMap
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import maxim.zaks.flatBuffers.Field

class CSharpGenerator {
	
	var rootTableName = "";
	
	String nameSpace
	
	String fileIdentifier
	
	HashMap<String, List<String>> tableToUnion = new HashMap<String, List<String>>()
	
	public def generate(Schema schema) {
		rootTableName = schema.rootType.type.name
		nameSpace = schema.namepsace?.name
		schema.fillTableToUnionMap
		fileIdentifier = schema.fileIdentifier?.identifier
		'''
		
		// generated with FlatBuffersSchemaEditor https://github.com/mzaks/FlatBuffersSchemaEditor
		«IF nameSpace!=null»
		namespace «nameSpace».Eager {
		«ENDIF»	
		
		using FlatBuffers;
		
		«FOR definition : schema.definitions»
		«definition.generateDefinition»
		«ENDFOR»
		
		«IF nameSpace!=null»
		}
		«ENDIF»
		'''
	}
	
	def fillTableToUnionMap(Schema schema) {
		tableToUnion.clear
		for (Definition definition : schema.definitions) {
			switch definition {
				Union case definition: {
					var typeNames = definition.unionCases.map[it.name]
					for (String tableType : typeNames){
						var unionNames = tableToUnion.get(tableType)
						if(unionNames == null){
							unionNames = new ArrayList<String>()
							tableToUnion.put(tableType, unionNames)
						}
						unionNames.add(definition.name)
					}
				}
			}
		} 
	}
	
	def generateDefinition(Definition definition) {
		switch definition {
			Table case definition: definition.generateTable
			Enum case definition: definition.generateEnum
			Union case definition: definition.generateUnion
		}
	}
	
	def generateTable(Table table) '''
		public sealed class «table.name» : Table«table.implmentsUnion» {
			«FOR p : table.fields.indexedFields.map[fieldAsProperty(it.value, it.key)]»
			«p»
			«ENDFOR»
			
			«table.generateMethodsFromByteArrayAndBuffer»
			
			«table.generateMethodToByteArrayAndAddToByteBuffer»
		}
	'''
	
	def implmentsUnion(Table table) {
		if(!tableToUnion.containsKey(table.name)) return ''''''
		'''«FOR unionType : tableToUnion.get(table.name) BEFORE ', ' SEPARATOR ', '»«unionType»«ENDFOR»'''
	}
	
	
	def fieldAsProperty(Field field, int index)'''	
		«IF field.isDeprecated»[System.Obsolete]«ENDIF»public «field.getType.generateFieldType» «field.getName»;
	'''
	
	
	def isDeprecated(Field field){
		if(field.getAttributes == null) return false
		field.getAttributes.atributeNames.findFirst[it.deprectated] != null
	}
	
	def generateMethodsFromByteArrayAndBuffer(Table table){
		var fromByteArrayMethod = ''''''
		if(table.name == rootTableName){
			fromByteArrayMethod ='''
			public static «table.name» FromByteArray(byte[] data) {
				«table.name» obj = new «table.name»();
				obj.bb = new ByteBuffer(data);
				obj.bb_pos = obj.bb.GetInt(obj.bb.Position) + obj.bb.Position; 
				
				«FOR p : table.fields.indexedFields.map[initFields(it.value, it.key)]»
				«p»
				«ENDFOR»
				return obj;
			}
			'''
		}
		fromByteArrayMethod + '''
		internal static «table.name» FromByteBuffer(ByteBuffer _bb, int pos) {
			«table.name» obj = new «table.name»();
			
			obj.bb_pos = pos; 
			obj.bb = _bb;
			
			«FOR p : table.fields.indexedFields.map[initFields(it.value, it.key)]»
			«p»
			«ENDFOR»
			return obj;
		}
		'''
	}
	
	def indexedFields(EList<Field> fields) {
		var result = new ArrayList<Pair<Integer, Field>>();
		var index = 0
		for (Field f : fields){
			if(f.getType.isUnion) {
				result.add(new Pair<Integer, Field>(index, f))
				index += 2
			} else {
				result.add(new Pair<Integer, Field>(index, f))
				index += 1
			}
		}
		result
	}
	
	def isUnion(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Union case type: return true
			}
		}
		return false
	}
	
	def initFields(Field field, int index) {
		if(field.getType.primType != null){
			'''	
				int o«index» = obj.__offset(4 + 2*«index»); 
				«field.generateSetPrimitiveTypeStatement(index)»
			'''
			 
		} else if(field.getType.defType != null){
				val definition = field.getType.defType
				switch definition {
					Table case definition: '''	
						int o«index» = obj.__offset(4 + 2*«index»); 
						obj.«field.getName» =  o«index» != 0 ? «field.getType.defType.name».FromByteBuffer(obj.bb, obj.__indirect(o«index» + obj.bb_pos)) : null;
						'''
					Enum case definition: '''
						int o«index» = obj.__offset(4 + 2*«index»); 
						obj.«field.getName» =  o«index» != 0 ? («definition.name»)obj.bb.«definition.converPrimitiveTypeGetter»(o«index» + obj.bb_pos) : («definition.name»)0;
					'''
					Union case definition: '''
						byte «field.getName»UnionCase = obj.bb.Get(obj.__offset(4 + 2*«index»));
						int o«index» = obj.__offset(4 + 2*«index + 1»);
						obj.«field.getName» =  o«index» != 0 ? «definition.unionHelperName».FromByteBuffer(«field.getName»UnionCase, obj.bb, obj.__indirect(o«index» + obj.bb_pos)) : null;
					'''
				}
		} else if(field.getType.vectorType != null){
			val LengthStatement = '''
				 int o«index» = obj.__offset(4 + 2*«index»);
				 int length«index» = o«index» != 0 ? obj.__vector_len(o«index») : 0;
				 obj.«field.getName» = new «field.getType.vectorType.generateVectorType»[length«index»];
			'''
			if(field.getType.vectorType.type.primType != null){
				return LengthStatement + '''
					for (int j = length«index»-1; j >=0; j-- ){
						«field.generateSetPrimitiveTypeStatementForVector(index)»
					}
					'''
			} else {
				// FIXME support for Enums Unions and multi dimensional Arrays
				return LengthStatement + '''
				for (int j = length«index»-1; j >=0; j-- ){
					obj.«field.getName»[j] = «field.getType.vectorType.type.defType.name».FromByteBuffer(obj.bb, obj.__indirect(obj.__vector(o«index») + j * 4));
				}
				'''
			}
		}
	}
	
	def generateSetPrimitiveTypeStatement(Field field, int index){
		if(field.getType.primType == "string"){
			'''obj.«field.getName» =  o«index» != 0 ? obj.__string(o«index» + obj.bb_pos) : null;'''
		} else if (field.getType.primType == "bool"){
			'''obj.«field.getName» =  o«index» != 0 ? 0!=obj.bb.«field.getType.primType.converPrimitiveTypeGetter»(o«index» + obj.bb_pos) : («field.getType.primType.converPrimitiveType»)«field.defaultValueString»;'''
		} else {
			'''obj.«field.getName» =  o«index» != 0 ? obj.bb.«field.getType.primType.converPrimitiveTypeGetter»(o«index» + obj.bb_pos) : («field.getType.primType.converPrimitiveType»)«field.defaultValueString»;'''
		}
		
	}
	
	def generateSetPrimitiveTypeStatementForVector(Field field, int index){
		if(field.getType.vectorType.type.primType == "string"){
			'''obj.«field.getName»[j] = obj.__string(obj.__vector(o«index») + j * 4);'''
		} else if (field.getType.vectorType.type.primType == "bool"){
			'''obj.«field.getName»[j] = 0!=obj.bb.«field.getType.vectorType.type.primType.converPrimitiveTypeGetter»(obj.__vector(o«index») + j);'''
		} else {
			'''obj.«field.getName»[j] = obj.bb.«field.getType.vectorType.type.primType.converPrimitiveTypeGetter»(obj.__vector(o«index») + j * «field.getType.vectorType.type.primType.converPrimitiveTypeToLength»);'''
		}
		
	}
	
	def generateMethodToByteArrayAndAddToByteBuffer(Table table){
		var rootBuild = ''''''
		if(table.name == rootTableName){
			var finishCall = '''builder.Finish(offset);'''
			if(fileIdentifier != null){
				finishCall = '''builder.Finish(offset, "«fileIdentifier»");'''
			}
			rootBuild = '''
			public byte[] ToByteArray(){
				FlatBufferBuilder builder = new FlatBufferBuilder(1);
				var offset = this.AddToByteBuffer(builder);
				«finishCall»
				return builder.SizedByteArray();
			}
			'''
		}
		rootBuild + '''
			internal int AddToByteBuffer(FlatBufferBuilder builder){
				
				«FOR p : table.fields.indexedFields.map[buildChildrenOffsets(it.value, it.key)]»
				«p»
				«ENDFOR»
				
				builder.StartObject(«table.numberOfFields»);
				
				«FOR p : table.fields.indexedFields.reverse.map[addVTableToByteBuffer(it.value, it.key)]»
				«p»
				«ENDFOR»
				
				return builder.EndObject();
			}
		'''
	}
	
	def numberOfFields(Table t) {
		if(t.fields.isEmpty) return 0
		
		val lastField = t.fields.indexedFields.last
		if(lastField.value.getType.isUnion){
			lastField.key + 2
		} else {
			lastField.key + 1
		}
	}
	
	def buildChildrenOffsets(Field field, int index) {
		if(field.isDeprecated) return '''// «field.getName» is deprecated'''
		if(field.getType.primType != null && field.getType.primType == "string"){
			'''
				StringOffset offset«index» = this.«field.getName» == null ? default(StringOffset) : builder.CreateString(this.«field.getName»);
			'''
		} else if(field.getType.defType != null){
			val typeName = field.getType.defType.name
			val definition = field.getType.defType
			switch definition {
				Table case definition: '''
					int offset«index» = this.«field.getName» == null ? 0 : this.«field.getName».AddToByteBuffer(builder);
					''' 
				Union case definition: '''
					int offset«index» = this.«field.getName» == null ? 0 : «definition.unionHelperName».AddToByteBuffer(this.«field.getName», builder);
				'''
			}
			
		} else if(field.getType.vectorType != null) {
			'''
				VectorOffset offset«index»;
				if(this.«field.getName» == null) {
					offset«index» = default(VectorOffset);
				} else {
					«field.getType.vectorType.buildVector(field, index)»
				}
			'''
		}
	}
	
	def buildVector(Vector vector, Field field, int index){
		if(vector.type.primType != null){
			if(vector.type.primType != "string"){
				val length = vector.type.primType.converPrimitiveTypeToLength
				'''
				builder.StartVector(«length», this.«field.getName».Length, «length»);
				for (int i = this.«field.getName».Length - 1; i >= 0; i--) {
					builder.«vector.type.primType.converPrimitiveTypeAdd»(this.«field.getName»[i]);
				} 
				offset«index» = builder.EndVector();
				'''
			} else {
				'''
				StringOffset[] data = new StringOffset[this.«field.getName».Length];
				for (int i = this.«field.getName».Length - 1; i >= 0; i--) {
					data[i] = builder.CreateString(this.«field.getName»[i]);
				}
				builder.StartVector(4, this.«field.getName».Length, 4);
				for (int i = data.Length - 1; i >= 0; i--) {
					builder.AddOffset(data[i].Value);
				} 
				offset«index» = builder.EndVector();
				'''
			}
			
		} else if(vector.type.defType != null){
			val typeName = vector.type.defType.name
			val definition = vector.type.defType
			switch definition {
				Table case definition: '''
					int[] data = new int[this.«field.getName».Length];
					for (int i = this.«field.getName».Length - 1; i >= 0; i--) {
						data[i] = this.«field.getName»[i].AddToByteBuffer(builder);
					}
					builder.StartVector(4, this.«field.getName».Length, 4);
					for (int i = data.Length - 1; i >= 0; i--) {
						builder.AddOffset(data[i]);
					} 
					offset«index» = builder.EndVector();
					'''
				Enum case definition: '''
					builder.StartVector(«definition.converPrimitiveTypeToLength», this.«field.getName».Length, «definition.converPrimitiveTypeToLength»);
					for (int i = this.«field.getName».Length - 1; i >= 0; i--) {
						builder.«definition.converPrimitiveTypeAdd»(this.«field.getName»[i]);
					} 
					offset«index» = builder.EndVector();
					''' 
			}
		}
	}
		
	
	def addVTableToByteBuffer(Field field, int index){
		if(field.isDeprecated){
			return '''// «field.getName» is deprecated'''
		}
		if(field.getType.primType != null){
			if(field.getType.primType == "string"){
				'''
					builder.AddOffset(«index», offset«index».Value, 0);
				'''
			} else {
				'''
					builder.«field.getType.primType.converPrimitiveTypeAdd»(«index», this.«field.getName», («field.getType.primType.converPrimitiveType»)«field.defaultValueString»);
				'''
			}
		} else if(field.getType.defType != null){
			val definition = field.getType.defType
			switch definition {
				Table case definition: '''builder.AddOffset(«index», offset«index», 0);'''
				Enum case definition: '''builder.«definition.converPrimitiveTypeAdd»(«index», («definition.converPrimitiveType»)this.«field.getName», 0);'''
				Union case definition: {
					'''
					builder.AddOffset(«index+1», offset«index», 0);
					builder.AddByte(«index», «definition.unionHelperName».GetCase(this.«field.getName»), 0);
					'''
				} 
			}
		} else {
			'''
				builder.AddOffset(«index», offset«index».Value, 0);
			'''
		}
	}
	
	def defaultValueString(Field field){
		if(field.getDefaultValue == null){
			if(field.getType.primType == "bool"){
				return "false"
			} else {
				return "0"
			}
		}
		if(field.getDefaultValue.isFalse){
			return "false"
		} else if(field.getDefaultValue.isTrue){
			return "true"
		} else if(field.getDefaultValue.enumCase != null){
			return field.getType.defType.name + "." + field.getDefaultValue.enumCase; 
		}
		
		return field.getDefaultValue.number
	}
	
	def generateFieldType(Type fieldType) {
		if(fieldType.primType != null){
			'''«fieldType.primType.converPrimitiveType»'''
		} else if(fieldType.defType != null) {
			'''«fieldType.defType.name»'''
		} else if(fieldType.vectorType != null) {
			'''«fieldType.vectorType.generateVectorType»[]'''
		} else if(fieldType.qualifiedType != null) {
			'''«fieldType.qualifiedType»'''
		}
	}
	
	def generateVectorType(Vector vectorType){
		if(vectorType.type.primType != null){
			'''«vectorType.type.primType.converPrimitiveType»'''
		}else if(vectorType.type.defType != null){
			'''«vectorType.type.defType.name»'''
		}
	}
	
	def generateEnum(Enum e) '''
		public enum «e.name»«IF e.type != null»: «e.converPrimitiveType»«ENDIF»
		{
			«FOR ec : e.enumCases»
			«ec.name»«IF ec.hasValue» = «ec.value»«ENDIF»,
			«ENDFOR»
		}
	'''
	
	def generateUnion(Union union) '''
		public interface «union.name» {}
		«union.generateUnionHelper»
	'''
	
	def generateUnionHelper(Union union) '''
		internal static class «union.unionHelperName» {
			internal static «union.name» FromByteBuffer(byte unionCase, ByteBuffer _bb, int pos){
				switch (unionCase) {
				«FOR indexedUnionCase : union.unionCases.indexed»
					case «indexedUnionCase.key + 1»: return «indexedUnionCase.value.name».FromByteBuffer(_bb, pos);
				«ENDFOR»
				}
				return null;
			}
		
			internal static byte GetCase(«union.name» o){
				«FOR indexedUnionCase : union.unionCases.indexed»
				if(o is «indexedUnionCase.value.name») return «indexedUnionCase.key + 1»;
				«ENDFOR»
				return 0;
			}
			
			internal static int AddToByteBuffer(«union.name» o, FlatBufferBuilder builder){
				«FOR indexedUnionCase : union.unionCases.indexed»
				if(o is «indexedUnionCase.value.name») return (o as «indexedUnionCase.value.name»).AddToByteBuffer(builder);
				«ENDFOR»
				return 0;
			}
		}
	'''
	
	def unionHelperName(Union union) '''«union.name»UnionHelper'''
	
	def converPrimitiveType(Enum definition) {
		if(definition.type == null){
			return "int".converPrimitiveType
		}
		definition.type.converPrimitiveType
	}
	
	def converPrimitiveType(String type) {
		switch type {
			case 'bool' : '''bool'''
			case 'byte' : '''sbyte'''
			case 'ubyte' : '''byte'''
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
	
	def converPrimitiveTypeGetter(Enum definition) {
		if(definition.type == null){
			return "int".converPrimitiveTypeGetter
		}
		definition.type.converPrimitiveTypeGetter
	}
	
	def converPrimitiveTypeGetter(String type) {
		switch type {
			case 'bool' : '''Get'''
			case 'byte' : '''GetSbyte'''
			case 'ubyte' : '''Get'''
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
	
	def converPrimitiveTypeAdd(Enum definition) {
		if(definition.type == null){
			return "int".converPrimitiveTypeAdd
		}
		definition.type.converPrimitiveTypeAdd
	}
	
	def converPrimitiveTypeAdd(String type) {
		switch type {
			case 'bool' : '''AddBool'''
			case 'byte' : '''AddSbyte'''
			case 'ubyte' : '''AddByte'''
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
	
	def converPrimitiveTypeToLength(Enum definition) {
		if(definition.type == null){
			return "int".converPrimitiveTypeToLength
		}
		definition.type.converPrimitiveTypeToLength
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