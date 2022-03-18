package com.chrisvasqm.exercises_part2.decorator;

public class Artefact implements Renderer {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
