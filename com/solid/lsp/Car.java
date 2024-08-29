package com.solid.lsp;

public class Car extends MotorVehicle {
    @Override
    public void wheelCount() {
        System.out.println(this.getClass().getName() + " having 4 wheels...");
    }
}
