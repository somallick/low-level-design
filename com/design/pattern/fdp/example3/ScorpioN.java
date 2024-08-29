package com.design.pattern.fdp.example3;


import com.design.pattern.fdp.example3.model.ScorpioNBodyShell;
import com.design.pattern.fdp.example3.model.ScorpioNEngine;

public class ScorpioN extends Scorpio{ // factory class
    public void makeScorpio() { // factory method
        System.out.println("ScorpioN class e achi");
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am inside ScorpioN Class");
    }
}
