package com.chrisvasqm.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
}
