package com.chrisvasqm.exercises_part1.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    private final List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        if (states.size() < 1)
            throw new IllegalStateException("No more states are available");

        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
