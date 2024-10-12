package src.design.pattern.creational.pdp.example2;

public interface IScorpioPrototype {
    public IScorpioPrototype clone();
    public void setEngine(ScorpioEngine scorpioEngine);
    public void start();
}
