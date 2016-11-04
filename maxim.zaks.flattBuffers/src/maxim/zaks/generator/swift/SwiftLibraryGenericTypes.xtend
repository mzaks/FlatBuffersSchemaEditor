package maxim.zaks.generator.swift

class SwiftLibraryGenericTypes {	
	public static val definitions = '''
public typealias Offset = Int32

public protocol Scalar : Equatable {}

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

public protocol PoolableInstances : AnyObject {
    static var maxInstanceCacheSize : UInt { get set }
    static var instancePool : ContiguousArray<Self> { get set }
    static var instancePoolMutex : pthread_mutex_t { get set } /// Should be initialized to setupInstancePoolMutex
    init()
    func reset()
}

public extension PoolableInstances {
    
    // Must be called to initialize mutex
    public static func setupInstancePoolMutex() -> pthread_mutex_t
    {
        var mtx = pthread_mutex_t()
        pthread_mutex_init(&mtx, nil)
        return mtx
    }
    
    // Optional preheat of instance pool
    public static func fillInstancePool(initialPoolSize : UInt) -> Void {
        pthread_mutex_lock(&instancePoolMutex)
        defer { pthread_mutex_unlock(&instancePoolMutex) }

        while ((UInt(instancePool.count) < initialPoolSize) && (UInt(instancePool.count) < maxInstanceCacheSize))
        {
            instancePool.append(Self())
        }
    }
    
    public static func createInstance() -> Self {
        guard maxInstanceCacheSize > 0 else // avoid taking the mutex if not using pool
        {
            return Self()
        }
        
        pthread_mutex_lock(&instancePoolMutex)
        defer { pthread_mutex_unlock(&instancePoolMutex) }

        if (instancePool.count > 0)
        {
            let instance = instancePool.removeLast()
            return instance
        }
        return Self()
    }
    
    // reuseInstance can be called when we believe we are about to zero out
    // the final strong reference we hold ourselves to put the instance in for reuse
    public static func reuseInstance(inout instance : Self) {
        guard maxInstanceCacheSize > 0 else // avoid taking the mutex if not using pool
        {
            return // don't pool
        }

        pthread_mutex_lock(&instancePoolMutex)
        defer { pthread_mutex_unlock(&instancePoolMutex) }
        
        if (isUniquelyReferencedNonObjC(&instance) && (UInt(instancePool.count) < maxInstanceCacheSize))
        {
            instance.reset()
            instancePool.append(instance)
        }
    }
}



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
    public let fullMemoryAlignment : Bool
    public let nullTerminatedUTF8 : Bool
    public init(initialCapacity : Int = 1, uniqueStrings : Bool = true, uniqueTables : Bool = true, uniqueVTables : Bool = true, forceDefaults : Bool = false, fullMemoryAlignment: Bool = true, nullTerminatedUTF8 : Bool = false) {
        self.initialCapacity = initialCapacity
        self.uniqueStrings = uniqueStrings
        self.uniqueTables = uniqueTables
        self.uniqueVTables = uniqueVTables
        self.forceDefaults = forceDefaults
        self.fullMemoryAlignment = fullMemoryAlignment
        self.nullTerminatedUTF8 = nullTerminatedUTF8
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

postfix operator § {}

public postfix func §(value: UnsafeBufferPointer<UInt8>) -> String? {
    return String.init(bytesNoCopy: UnsafeMutablePointer<UInt8>(value.baseAddress), length: value.count, encoding: NSUTF8StringEncoding, freeWhenDone: false)
}


'''
}