package com.chrisvasqm.creational.builder;

public class TextDocumentBuilder implements DocumentBuilder {
    private final StringBuilder builder = new StringBuilder();

    @Override
    public void addText(Text text) {
        System.out.println("Adding Text to Text Document");
        builder.append(text);
    }

    @Override
    public void addImage(Image image) {
        // Text Document don't allow images to be added to it
    }

    @Override
    public String getResult() {
        return builder.toString();
    }
}
