package com.chrisvasqm.creational.prototype;

public class ContextMenu {
    private final Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        timeline.add(component.duplicate());
    }
}
