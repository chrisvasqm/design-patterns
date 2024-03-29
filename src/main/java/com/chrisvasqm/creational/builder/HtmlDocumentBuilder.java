package com.chrisvasqm.creational.builder;

import com.chrisvasqm.creational.builder.html.HtmlDocument;
import com.chrisvasqm.creational.builder.html.HtmlImage;
import com.chrisvasqm.creational.builder.html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder {
    private final HtmlDocument document = new HtmlDocument();

    @Override
    public void addText(Text text) {
        System.out.println("Adding Text to HTML Document");
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        System.out.println("Adding image to HTML Document");
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }
}
