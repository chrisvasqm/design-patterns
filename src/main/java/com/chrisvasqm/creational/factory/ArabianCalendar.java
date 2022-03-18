package com.chrisvasqm.creational.factory;

import java.util.Date;

public class ArabianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding event to Arabian calendar.");
    }
}
