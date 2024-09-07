package com.solid.principle.dependency_inversion;

public class ConsoleLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println(this.getClass().getName() + ": " + message);
    }
}
