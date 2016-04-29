package maxim.zaks.generator.swift

class SwiftLibraryGenericTypes {	
	public static val definitions = '''
public typealias Offset = Int32

public protocol Scalar : Equatable {}

extension Scalar {
    var littleEndian : Self {
        switch self {
        case let v as Int16 : return v.littleEndian as! Self
        case let v as UInt16 : return v.littleEndian as! Self
        case let v as Int32 : return v.littleEndian as! Self
        case let v as UInt32 : return v.littleEndian as! Self
        case let v as Int64 : return v.littleEndian as! Self
        case let v as UInt64 : return v.littleEndian as! Self
        case let v as Int : return v.littleEndian as! Self
        case let v as UInt : return v.littleEndian as! Self
        default : return self
        }
    }
}

extension Bool : Scalar {}
extension Int8 : Scalar {}
extension UInt8 : Scalar {}
extension Int16 : Scalar {}
extension UInt16 : Scalar {}
extension Int32 : Scalar {}
extension UInt32 : Scalar {}
extension Int64 : Scalar {}
extension UInt64 : Scalar {}
extension Int : Scalar {}
extension UInt : Scalar {}
extension Float32 : Scalar {}
extension Float64 : Scalar {}

public final class LazyVector<T> : SequenceType {
    private let _generator : (Int)->T?
    private let _count : Int
    
    public init(count : Int, generator : (Int)->T?){
        _generator = generator
        _count = count
    }
    
    public subscript(i: Int) -> T? {
        guard i >= 0 && i < _count else {
            return nil
        }
        return _generator(i)
    }
    
    public var count : Int {return _count}
    
    public func generate() -> AnyGenerator<T> {
        var index = 0
        
        return AnyGenerator(body: { [self]
            let value = self[index]
            index += 1
            return value
        })
    }
}
'''
}