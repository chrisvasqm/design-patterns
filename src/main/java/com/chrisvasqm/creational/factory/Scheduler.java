package com.chrisvasqm.creational.factory;

import java.util.Date;

public class Scheduler {
    public void schedule(Event event) {
        var today = new Date();
        createCalendar().addEvent(event, today);
    }

    protected Calendar createCalendar() {
        return new GregorianCalendar();
    }
}
