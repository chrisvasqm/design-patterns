package com.chrisvasqm.structural.decorator;

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
