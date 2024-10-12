package src.design.pattern.structural.bridge.example1;

import java.util.List;

//Abstraction
public abstract class AbstractScorpio {
    //BRIDGE (Composition)
    protected ScorpioImpl scorpioImpl;
    public AbstractScorpio(ScorpioImpl scorpioImpl){
        this.scorpioImpl = scorpioImpl;
    }
    public abstract void printSafetyFeature();
    public abstract boolean IsRightHanded();
    public abstract List<String> availableColor();
}
