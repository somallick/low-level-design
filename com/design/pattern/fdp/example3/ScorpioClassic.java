package com.design.pattern.fdp.example3;


import com.design.pattern.fdp.example3.model.ScorpioClassicBodyShell;
import com.design.pattern.fdp.example3.model.ScorpioClassicEngine;

public class ScorpioClassic extends Scorpio{ // factory class
    public void makeScorpio() { // factory method
        System.out.println("ScorpioClassic class e achi");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScorpioClassicBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am inside ScorpioClassic Class");
    }
}
