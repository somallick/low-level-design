package com.design.pattern.structural.bridge.example1;

public class Main {
    public static void main(String[] args) {

        AbstractScorpio scorpioN_India = new ScorpioN(new ScorpioIndiaImpl());
        scorpioN_India.printSafetyFeature();
        System.out.println(scorpioN_India.availableColor().toString());

        AbstractScorpio scorpioN_USA = new ScorpioN(new ScorpioUSAImpl());
        scorpioN_USA.printSafetyFeature();
        System.out.println(scorpioN_India.availableColor().toString());

    }
}
