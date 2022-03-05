package com.chrisvasqm.exercises_part1.state;

public class Transit implements Travelable {
    @Override
    public int travel() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int direction() {
        System.out.println("Calculating Direction (transit)");
        return 1;
    }
}
