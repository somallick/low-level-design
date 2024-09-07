package com.solid.principle.liskov_substitution;

public class Cycle extends ManualVehicle{
    @Override
    public void wheelCount() {
        System.out.println(this.getClass().getName() + " having 2 wheels...");
    }
}
