package com.designpatterns;

import com.designpatterns.singleton.DoubleCheckedLockingLogger;
import com.designpatterns.singleton.EgarIntializedLogger;
import com.designpatterns.singleton.ThreadsafeLogger;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final EgarIntializedLogger egarIntializedLogger = EgarIntializedLogger.getInstance();
        egarIntializedLogger.info("Logged using EgarIntialized Logger");

        final ThreadSafeLoggerThread t1 = new ThreadSafeLoggerThread();
        final ThreadSafeLoggerThread t2 = new ThreadSafeLoggerThread();
        t1.start();
        t2.start();

        final DoubleCheckedLockingLogger doubleCheckedLockingLogger = DoubleCheckedLockingLogger.getInstance();
        try {
            doubleCheckedLockingLogger.info("Logged using Double Check Locking Logger");
            doubleCheckedLockingLogger.info("Logged using Double Check Locking Logger");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ThreadSafeLoggerThread extends Thread {
    public void run(){
        final ThreadsafeLogger threadsafeLogger = ThreadsafeLogger.getInstance();
        try {
            threadsafeLogger.info("Logged using Thread safe logger");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
