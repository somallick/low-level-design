package com.design.pattern.creational.fdp.example1;

public class Bike extends Vehicle
{
    private Bike()
    {

    }
    public Bike(String name,int seatingCap)
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
