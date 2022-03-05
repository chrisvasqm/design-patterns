package com.chrisvasqm.exercises_part1.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
