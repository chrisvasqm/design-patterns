package com.chrisvasqm.exercises_part2.decorator;

public class ErrorArtifact implements Renderer {
    private final Renderer renderer;

    public ErrorArtifact(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public String render() {
        return "[Error] - " + renderer.render();
    }
}
