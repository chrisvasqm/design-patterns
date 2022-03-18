package com.chrisvasqm.exercises_part2.composite;

import java.util.ArrayList;
import java.util.List;

public class SubTeam implements Component {
    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        System.out.println("Rendering SubTeam");
        for (var component : components)
            component.render();
    }
}
