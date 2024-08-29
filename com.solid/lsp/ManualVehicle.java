package com.solid.lsp;

public abstract class ManualVehicle implements Vehicle {
    public void startMoving() {
        System.out.println(this.getClass().getName()+ " has started moving...");
    }
}
