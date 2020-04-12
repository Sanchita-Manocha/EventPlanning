package com.au.eventplanning.app;

public class Config {
    private final Integer PORT;

    public Config() {
        PORT = Integer.valueOf(System.getProperty("port","22222"));
    }

    public Integer getPORT() {
        return PORT;
    }
}
