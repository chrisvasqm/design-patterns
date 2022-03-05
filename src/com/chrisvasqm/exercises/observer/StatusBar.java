package com.chrisvasqm.exercises.observer;

public class StatusBar implements Observer {
    private final DataSource dataSource;

    public StatusBar(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("StatusBar notified: " + dataSource.getValue());
    }
}
