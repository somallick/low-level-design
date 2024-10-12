package src.design.pattern.structural.proxy.example1;

public class RemoteProxy implements ICar{
    private Scorpio scorpio;

    public RemoteProxy() {
        this.scorpio = new Scorpio();
    }

    @Override
    public void turnLeft() {
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        scorpio.turnRight();
    }

    @Override
    public void goStraight() {
        scorpio.goStraight();
    }
}
