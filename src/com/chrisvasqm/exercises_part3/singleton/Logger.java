package com.chrisvasqm.exercises_part3.singleton;

public class Logger {
    private String fileName;
    private final static Logger instance = new Logger();

    private Logger() {}

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getInstance() {
        return instance;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}
