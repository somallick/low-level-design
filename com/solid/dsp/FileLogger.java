package com.solid.dsp;

public class FileLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println(this.getClass().getName() + ": " + message);
    }
}
