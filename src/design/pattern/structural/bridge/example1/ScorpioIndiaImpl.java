package src.design.pattern.structural.bridge.example1;

//Concrete Implementation
public class ScorpioIndiaImpl extends ScorpioImpl{

    @Override
    public void printSafetyFeature() {
        System.out.println("Indian region - Safety contain Two Air Bag");
    }

    @Override
    public boolean IsRightHanded() {
        return true;
    }
}
