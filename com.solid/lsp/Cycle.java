package com.solid.lsp;

public class Cycle extends ManualVehicle{
    @Override
    public void wheelCount() {
        System.out.println(this.getClass().getName() + " having 2 wheels...");
    }
}
