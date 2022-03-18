package com.chrisvasqm.exercises_part1.template;

public abstract class Task {
    private final Trail trail;

    public Task() {
        trail = new WindowTrail();
    }

    public void execute() {
        trail.before();
        doExecute();
        trail.after();
    }

    protected abstract void doExecute();

}
