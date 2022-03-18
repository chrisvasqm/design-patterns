package com.chrisvasqm.behavioural.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
