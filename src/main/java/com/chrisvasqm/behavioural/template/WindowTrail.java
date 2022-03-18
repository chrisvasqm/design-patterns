package com.chrisvasqm.behavioural.template;

public class WindowTrail implements Trail {
    @Override
    public void before() {
        System.out.println("Before closing window");
    }

    @Override
    public void after() {
        System.out.println("After closing window");
    }
}
