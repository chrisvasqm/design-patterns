package com.chrisvasqm.exercises_part1.state;

public class Car implements Travelable {
    @Override
    public int travel() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int direction() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
