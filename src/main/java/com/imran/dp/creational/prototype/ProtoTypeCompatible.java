package com.imran.dp.creational.prototype;

public interface ProtoTypeCompatible extends Cloneable {

    // Implementation classes must provide ability to give deep clones
    ProtoTypeCompatible clonePrototype() throws CloneNotSupportedException;
}
