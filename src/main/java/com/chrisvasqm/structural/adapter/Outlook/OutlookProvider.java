package com.chrisvasqm.structural.adapter.Outlook;

import com.chrisvasqm.structural.adapter.EmailProvider;

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
