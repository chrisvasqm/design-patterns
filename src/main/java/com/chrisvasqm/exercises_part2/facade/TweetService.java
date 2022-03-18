package com.chrisvasqm.exercises_part2.facade;

import java.util.List;

public class TweetService {
    private String apiKey;
    private String secret;

    public TweetService(String apiKey, String secret) {
        this.apiKey = apiKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        var client = new TwitterClient();

        return client.getRecentTweets(getAccessToken());
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(apiKey, secret);

        return oauth.getAccessToken(requestToken);
    }
}
