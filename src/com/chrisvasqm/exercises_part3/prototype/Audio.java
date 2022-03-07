package com.chrisvasqm.exercises_part3.prototype;

public class Audio implements Component {
    @Override
    public Component duplicate() {
        return new Audio();
    }
}
