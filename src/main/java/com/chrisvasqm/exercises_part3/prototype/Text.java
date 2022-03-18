package com.chrisvasqm.exercises_part3.prototype;

public class Text implements Component {
    private final String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component duplicate() {
        return new Text(content);
    }
}
