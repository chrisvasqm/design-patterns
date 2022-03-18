package com.chrisvasqm.structural.facade;

public class Demo {
    public static void show() {
        var service = new TweetService("apiKey", "secret");
        service.getRecentTweets();
    }
}
