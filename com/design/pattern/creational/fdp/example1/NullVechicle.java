package com.design.pattern.creational.fdp.example1;

public class NullVechicle extends Vehicle
{
    //default behavior or do nothing behaviour
    //invalid type of vehicle
    //invalid property display
    public NullVechicle()
    {
        this.name = "invalid Type";
        this.seatingCap = 0;
    }

    @Override
    String getDiscription() {
        return "Not a valid vechicle type";
    }

    @Override
    int getSeatingCapacity() {
        return 0;
    }
}
