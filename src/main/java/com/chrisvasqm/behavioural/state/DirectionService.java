package com.chrisvasqm.behavioural.state;

public class DirectionService {
    private final Travelable travelMethod;

    public DirectionService(Travelable travelMethod) {
        if (travelMethod == null)
            throw new IllegalArgumentException("Travel method can not be null.");

        this.travelMethod = travelMethod;
    }

    public Object getEta() {
        return travelMethod.travel();
    }

    public Object getDirection() {
        return travelMethod.direction();
    }
}
