package com.chrisvasqm.exercises_part2.adapter.Gmail;

import com.chrisvasqm.exercises_part2.adapter.EmailProvider;

public class GmailProvider implements EmailProvider {
    private final GmailClient client;

    public GmailProvider(GmailClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
