package com.chrisvasqm.exercises_part3.singleton;

public class Logger {
    private String fileName;

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}
