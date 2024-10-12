package com.design.pattern.structural.composite.example2;

//Leaf or Part
public class Rectangle implements UIComponent{
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void add(UIComponent component) {
        System.out.println("Adding rectangle");
    }

    @Override
    public void remove(UIComponent component) {
        System.out.println("Removing rectangle");
    }
}
