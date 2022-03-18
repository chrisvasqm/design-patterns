package com.chrisvasqm.creational.prototype;

public class Clip implements Component {
    @Override
    public Component duplicate() {
        return new Clip();
    }
}
