package com.chrisvasqm.exercises_part3.factory;

public class Demo {
    public static void show() {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());
    }
}
