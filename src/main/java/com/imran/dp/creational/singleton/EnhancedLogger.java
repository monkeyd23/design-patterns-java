package com.imran.dp.creational.singleton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EnhancedLogger {

    private List<String> logs;

    // private constructor
    private EnhancedLogger() {
        logs = new ArrayList<>();
    }

    // LazyHolder for Thread safe
    private static class LazyHolder {
        static final EnhancedLogger INSTANCE = new EnhancedLogger();
    }

    // public getInstance() method
    public static EnhancedLogger getInstance() {
        return  LazyHolder.INSTANCE;
    }

    public void log(String message) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.logs.add(timeStamp + " ---> " + message);
        System.out.println("Enhanced Logger: " + timeStamp + " ---> " + message);
    }

    public int getCount() {
        return this.logs.size();
    }

    public List<String> getLogs() {
        return this.logs;
    }
}
