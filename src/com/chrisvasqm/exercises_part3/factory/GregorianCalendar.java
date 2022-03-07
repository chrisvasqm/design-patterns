package com.chrisvasqm.exercises_part3.factory;

import java.util.Date;

public class GregorianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event to Gregorian calendar.");
    }
}
