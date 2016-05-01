package maxim.zaks.generator

import java.util.ArrayList
import java.util.HashSet
import maxim.zaks.flatBuffers.Enum
import maxim.zaks.flatBuffers.Field
import maxim.zaks.flatBuffers.Struct
import maxim.zaks.flatBuffers.StructField
import maxim.zaks.flatBuffers.Table
import maxim.zaks.flatBuffers.Type
import maxim.zaks.flatBuffers.Union
import maxim.zaks.flatBuffers.Definition

public class ModelExtensions {
	
	def getSize(Struct struct){
		var size = 0
		for(StructField field : struct.fields){
			if(field.getPrimType != null){
				size += field.getPrimType.lengthOfPrimType
			}
		}
		size
	}
	
	def indexOf(Struct struct, StructField destinationField){
		var index = 0
		for(StructField field : struct.fields){
			if(field == destinationField){
				return index
			}
			if(field.getPrimType != null){
				index += field.getPrimType.lengthOfPrimType
			}
		}
		index
	}
	
	def indexedFields(Table table) {
		var fields = table.fields
		var result = new ArrayList<Pair<Integer, Field>>();
		var index = 0
		for (Field f : fields){
			result.add(new Pair<Integer, Field>(index, f))
			if(f.getType.isUnion) {
				index += 2
			} else {
				index += 1
			}
		}
		result
	}
	
	def isRecursive(Definition definition) {
		switch definition {
			Table case definition: return _isRecursive(definition, new HashSet<String>())
			Union case definition: return _isRecursive(definition, new HashSet<String>())
		}
		false
	}
	
	private def boolean _isRecursive(Table table, HashSet<String> visited) {
		if (visited.add(table.name) == false){
			return true
		}
		for (Field f : table.fields){
			val type = f.type
			if (type.isTable){
				val t = type.defType as Table
				if(t._isRecursive(visited) == true){
					return true
				}
			} else if(type.isUnion){
				val u = type.defType as Union
				if(u._isRecursive(visited)){
					return true
				}
			} else if(type.isTableVector){
				val t = type.vectorType.type.defType as Table
				if(t._isRecursive(visited) == true){
					return true
				}
			}
		}
		false
	}
	
	private def boolean _isRecursive(Union union, HashSet<String> visited){
		for (Table t : union.unionCases){
			if(t._isRecursive(visited) == true){
				return true
			}
		}
		false
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
	
	def isEnum(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Enum case type: return true
			}
		}
		return false
	}
	
	def isTable(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Table case type: return true
			}
		}
		return false
	}
	
	def isStruct(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Struct case type: return true
			}
		}
		return false
	}
	
	def isScalar(Type t){ 
		t.primType != null && t.primType != "string"
	}
	
	def isString(Type t){ 
		t.primType != null && t.primType == "string"
	}
	
	def isScalarVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isScalar
	}
	
	def isEnumVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isEnum
	}
	
	def isStringVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isString
	}
	
	def isTableVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isTable
	}
	
	def isStructVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isStruct
	}
	
	def isUnionVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isUnion
	}
	
	def isDeprecated(Field field){
		if(field.getAttributes == null) return false
		field.getAttributes.atributeNames.findFirst[it.deprectated] != null
	}
	
	def lengthOfPrimType(String type) {
		switch type {
			case 'bool' : 1
			case 'byte' : 1
			case 'ubyte' : 1
			case 'short' : 2
			case 'ushort' : 2
			case 'int' : 4
			case 'uint' : 4
			case 'float' : 4
			case 'long' : 8
			case 'ulong' : 8
			case 'double' : 8
			default : 0
		}
	}
}