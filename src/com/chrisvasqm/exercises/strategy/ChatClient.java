package com.chrisvasqm.exercises.strategy;

public class ChatClient {
    private Encryptioner encryptioner;

    public ChatClient(Encryptioner encryptioner) {
        this.encryptioner = encryptioner;
    }

    public void send(String message) {
        encryptioner.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
