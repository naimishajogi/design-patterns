package com.designpatterns.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.String.format;

public class DoubleCheckedLockingLogger {

    private static DoubleCheckedLockingLogger instance;

    private File loggerFile;

    private DoubleCheckedLockingLogger() {
        try {
            final String directoryPath = format("%s/log", new File(".").getCanonicalPath());
            loggerFile = new File(format("%s/application-log-%s.log", directoryPath, LocalDateTime.now()));
            loggerFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DoubleCheckedLockingLogger getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingLogger.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingLogger();
                }
            }
        }

        return instance;
    }

    public void info(final String message) throws IOException {
        final FileWriter logWriter = new FileWriter(loggerFile);
        try {
            logWriter.write(format("[%s] %s", LocalTime.now(), message));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            logWriter.close();
        }
    }
}
