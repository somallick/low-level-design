package com.design.pattern.pdp.example1;

public interface IScorpioPrototype {
    public IScorpioPrototype clone();
    public void setEngine(ScorpioEngine scorpioEngine);
    public void start();
}
