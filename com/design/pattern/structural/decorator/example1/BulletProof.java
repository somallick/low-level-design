package com.design.pattern.structural.decorator.example1;

//ConcreteDecorator
public class BulletProof extends ScorpioDecorator {

    public BulletProof(ICar scorpio) {
        super(scorpio);
    }

    @Override
    public String getDescription() {
        return (scorpio.getDescription() + " with bullet proof");
    }

    @Override
    public float getWeight() {
        return scorpio.getWeight() + 300f;
    }
}
