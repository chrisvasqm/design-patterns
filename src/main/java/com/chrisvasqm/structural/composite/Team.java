package com.chrisvasqm.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component {
    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        System.out.println("Rendering Team");
        for (var component : components)
            component.render();
    }
}
