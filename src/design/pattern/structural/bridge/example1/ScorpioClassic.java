package src.design.pattern.structural.bridge.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScorpioClassic extends AbstractScorpio{

    public ScorpioClassic(ScorpioImpl scorpioImpl) {
        super(scorpioImpl);
    }
    @Override
    public void printSafetyFeature() {
        scorpioImpl.printSafetyFeature();
    }

    @Override
    public boolean IsRightHanded() {
        return scorpioImpl.IsRightHanded();
    }

    @Override
    public List<String> availableColor() {
        return new ArrayList<>(Arrays.asList("Grey", "Black", "Red"));
    }

}
