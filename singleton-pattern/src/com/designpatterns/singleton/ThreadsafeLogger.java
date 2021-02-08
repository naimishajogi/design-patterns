package com.designpatterns.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.String.format;

public class ThreadsafeLogger {

    private static ThreadsafeLogger instance;
    private static int lineNumber = 0;
    private File loggerFile;

    private ThreadsafeLogger() {
        final String directoryPath;
        try {
            directoryPath = format("%s/log", new File(".").getCanonicalPath());
            loggerFile = new File(format("%s/thread-safe-log-%s.log", directoryPath, LocalDateTime.now()));
            loggerFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ThreadsafeLogger getInstance() {
        if (instance == null) {
            instance = new ThreadsafeLogger();
        }
        return instance;
    }

    public void info(final String message) throws IOException {
        final FileWriter logWriter = new FileWriter(loggerFile, true);
        try {
            logWriter.append(format("%s.[%s] %s", lineNumber++,LocalTime.now(), message));
            logWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            logWriter.close();
        }
    }
}
