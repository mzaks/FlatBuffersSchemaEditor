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
    private let _replacer : ((Int, T)->())?
    private let _count : Int
    
    public init(count : Int, _ generator : (Int)->T?){
        _generator = generator
        _count = count
        _replacer = nil
    }
    
    public init(count : Int, _ generator : (Int)->T?, _ replacer: ((Int, T)->())? = nil){
        _generator = generator
        _count = count
        _replacer = replacer
    }
    
    public subscript(i: Int) -> T? {
        get {
            guard i >= 0 && i < _count else {
                return nil
            }
            return _generator(i)
        }
        set {
            guard let replacer = _replacer, let value = newValue else {
                return
            }
            guard i >= 0 && i < _count else {
                return
            }
            replacer(i, value)
        }
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

public struct BinaryBuildConfig{
    public let initialCapacity : Int
    public let uniqueStrings : Bool
    public let uniqueTables : Bool
    public let uniqueVTables : Bool
    public let forceDefaults : Bool
    public init(initialCapacity : Int = 1, uniqueStrings : Bool = true, uniqueTables : Bool = true, uniqueVTables : Bool = true, forceDefaults : Bool = false) {
        self.initialCapacity = initialCapacity
        self.uniqueStrings = uniqueStrings
        self.uniqueTables = uniqueTables
        self.uniqueVTables = uniqueVTables
        self.forceDefaults = forceDefaults
    }
}

public struct BinaryReadConfig {
    public let uniqueTables : Bool
    public let uniqueStrings : Bool
    public init(uniqueStrings : Bool = true, uniqueTables : Bool = true) {
        self.uniqueStrings = uniqueStrings
        self.uniqueTables = uniqueTables
    }
}

'''
}