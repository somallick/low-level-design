package com.design.pattern.fdp.example1;

public class Bus extends Vehicle{
    private Bus()
    {

    }
    public Bus(String name,int seatingCap)
    {
        this.name = name;
        this.seatingCap = seatingCap;
    }

    @Override
    int getSeatingCapacity() {
        return this.seatingCap;
    }

    @Override
    String getDiscription() {
        return this.name;
    }
}
