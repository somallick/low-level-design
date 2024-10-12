package src.design.pattern.structural.proxy.example1;

public class Scorpio implements ICar{

    @Override
    public void turnLeft() {
        System.out.println("I'm inside turnLeft in Scorpio Class");
    }

    @Override
    public void turnRight() {
        System.out.println("I'm inside turnRight in Scorpio Class");
    }

    @Override
    public void goStraight() {
        System.out.println("I'm inside goStraight in Scorpio Class");
    }
}
