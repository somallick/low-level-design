package com.design.pattern.structural.decorator.example1;

//Decorator
public abstract class ScorpioDecorator implements ICar {

    ICar scorpio;

    public ScorpioDecorator(ICar scorpio) {
        this.scorpio = scorpio;
    }

    @Override
    public void start() {
        scorpio.start();
    }

    @Override
    public void stop() {
        scorpio.stop();
    }

}
