package com.design.pattern.fdp.example3;


import com.design.pattern.fdp.example3.model.IBodyShell;
import com.design.pattern.fdp.example3.model.IEngine;
import com.design.pattern.fdp.example3.model.ScorpioBodyShell;
import com.design.pattern.fdp.example3.model.ScorpioEngine;

public class Scorpio { // factory class
    IEngine engine;
    IBodyShell bodyShell;

    public void makeScorpio() { // factory method
        System.out.println("Scorpio class e achi");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am inside Scorpio Parent Class");
    }
}
