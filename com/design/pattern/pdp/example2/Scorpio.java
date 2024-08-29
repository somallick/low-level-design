package com.design.pattern.pdp.example2;

public class Scorpio implements IScorpioPrototype, Cloneable {
    private ScorpioEngine engine;

    public Scorpio() {
        this.engine = new ScorpioEngine();
    }

    public Scorpio(ScorpioEngine engine) {
        this.engine = new ScorpioEngine(engine);
    }

    // This creates a copy of the Scorpio.
    @Override
    public IScorpioPrototype clone() {
        return new Scorpio(this.engine);
    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.engine = scorpioEngine;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().getName() + " - Start hoyeche Scorpio");
    }

    @Override
    public String toString() {
        return "Scorpio{" +
                "engine=" + engine +
                '}';
    }
}
