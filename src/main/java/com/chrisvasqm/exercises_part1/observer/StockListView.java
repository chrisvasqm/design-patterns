package com.chrisvasqm.exercises_part1.observer;

public class StockListView implements Observer {
    private final DataSource dataSource;

    public StockListView(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("StockListView notified: " + dataSource.getValue());
    }
}
