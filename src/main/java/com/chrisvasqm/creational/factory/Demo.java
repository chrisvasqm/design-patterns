package com.chrisvasqm.creational.factory;

public class Demo {
    public static void show() {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());
    }
}
