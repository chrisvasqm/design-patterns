package com.chrisvasqm.creational.factory;

public class ArabianScheduler extends Scheduler {
    @Override
    protected Calendar createCalendar() {
        return new ArabianCalendar();
    }
}
