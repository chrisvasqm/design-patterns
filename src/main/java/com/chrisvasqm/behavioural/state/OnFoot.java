package com.chrisvasqm.behavioural.state;

public class OnFoot implements Travelable {
    @Override
    public int travel() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int direction() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
