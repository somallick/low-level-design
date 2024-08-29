package com.solid.lsp;

public abstract class MotorVehicle implements Vehicle {
    public void startEngine() {
        System.out.println(this.getClass().getName() + " has started engine...");
    }
}
