package com.chrisvasqm.exercises_part3.builder;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getResult();
}
