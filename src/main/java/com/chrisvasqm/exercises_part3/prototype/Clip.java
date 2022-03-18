package com.chrisvasqm.exercises_part3.prototype;

public class Clip implements Component {
    @Override
    public Component duplicate() {
        return new Clip();
    }
}
