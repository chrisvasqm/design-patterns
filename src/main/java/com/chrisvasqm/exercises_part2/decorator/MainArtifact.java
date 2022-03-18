package com.chrisvasqm.exercises_part2.decorator;

public class MainArtifact implements Renderer {
    private final Renderer renderer;

    public MainArtifact(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public String render() {
        return "[Main] - " + renderer.render();
    }
}
