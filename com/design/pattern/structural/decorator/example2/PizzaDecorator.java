package com.design.pattern.structural.decorator.example2;

/*
* Abstract Decorator - This class implements the Pizza interface and holds a reference to a Pizza object.
* It delegates operations to the wrapped pizza object.
*/
public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }
}