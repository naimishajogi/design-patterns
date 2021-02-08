package com.designpatterns.singleton;

import java.time.LocalTime;

import static java.lang.String.format;

public class EgarIntializedLogger {

    private static final EgarIntializedLogger instance = new EgarIntializedLogger();

    private EgarIntializedLogger() {}

    public static EgarIntializedLogger getInstance() {
        return instance;
    }

    public void info(final String message) {
        System.out.println(format("[%s] %s", LocalTime.now(), message));
    }
}
