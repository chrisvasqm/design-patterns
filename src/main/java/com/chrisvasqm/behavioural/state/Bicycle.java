package com.chrisvasqm.behavioural.state;

public class Bicycle implements Travelable {
    @Override
    public int travel() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int direction() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
