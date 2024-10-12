package com.design.pattern.structural.bridge.example1;

//Concrete Implementation
public class ScorpioUSAImpl extends ScorpioImpl{

    @Override
    public void printSafetyFeature() {
        System.out.println("USA region - Safety contain One Air Bag");
    }

    @Override
    public boolean IsRightHanded() {
        return false;
    }
}
