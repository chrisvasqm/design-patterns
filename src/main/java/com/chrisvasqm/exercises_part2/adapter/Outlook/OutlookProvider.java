package com.chrisvasqm.exercises_part2.adapter.Outlook;

import com.chrisvasqm.exercises_part2.adapter.EmailProvider;

public class OutlookProvider implements EmailProvider {
    private final OutlookClient client;

    public OutlookProvider(OutlookClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.init();
        client.getUpdates();
    }
}
