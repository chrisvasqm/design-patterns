package com.chrisvasqm.exercises_part1.observer;

public class DataSource extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
