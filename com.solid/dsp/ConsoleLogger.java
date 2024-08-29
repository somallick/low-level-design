package com.solid.dsp;

public class ConsoleLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println(this.getClass().getName() + ": " + message);
    }
}
