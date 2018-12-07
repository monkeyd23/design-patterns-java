package com.imran.dp.creational.singleton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Logger {

    private List<String> logs;

    public Logger() {
        logs = new ArrayList<>();
    }

    public void log(String message) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        this.logs.add(timeStamp + " ---> " + message);
        System.out.println("Logger Logger: " + timeStamp + " ---> " + message);
    }

    public int getCount() {
        return this.logs.size();
    }

    public List<String> getLogs() {
        return this.logs;
    }
}
