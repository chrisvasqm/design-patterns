package com.chrisvasqm.exercises.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
