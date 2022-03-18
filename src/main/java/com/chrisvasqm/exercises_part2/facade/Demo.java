package com.chrisvasqm.exercises_part2.facade;

public class Demo {
    public static void show() {
        var service = new TweetService("apiKey", "secret");
        service.getRecentTweets();
    }
}
