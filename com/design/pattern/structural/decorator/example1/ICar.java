package com.design.pattern.structural.decorator.example1;

//Component Interface
public interface ICar {
    float baseWeight = 1500;
    public void start();
    public void stop();
    public String getDescription();
    public float getWeight();
}
