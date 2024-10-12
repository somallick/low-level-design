package src.design.pattern.creational.fdp.example3;


import src.design.pattern.creational.fdp.example3.model.ScorpioNBodyShell;
import src.design.pattern.creational.fdp.example3.model.ScorpioNEngine;

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
