package com.design.pattern.pdp.example2;

public class Main {
    public static void main(String[] args) {

//        create a prototype
        IScorpioPrototype prototype = new Scorpio();
        System.out.println(prototype);

//        create a Scorpio N
        IScorpioPrototype scorpioN = prototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());
        System.out.println(prototype);
        System.out.println(scorpioN);

//        create a Scorpio Classic
        IScorpioPrototype scorpioClassic = prototype.clone();
        scorpioClassic.setEngine(new ScorpioClassic());
        System.out.println(prototype);
        System.out.println(scorpioClassic);


    }
}
