package com.solid.principle.liskov_substitution;

public class AutomobileMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.wheelCount();
        vehicle = new Cycle();
        vehicle.wheelCount();

        MotorVehicle motorVehicle = new Car();
        motorVehicle.startEngine();
        ManualVehicle manualVehicle = new Cycle();
        manualVehicle.startMoving();

    }
}
