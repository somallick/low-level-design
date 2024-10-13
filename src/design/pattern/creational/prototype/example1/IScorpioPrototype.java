package src.design.pattern.creational.prototype.example1;

public interface IScorpioPrototype {
    public IScorpioPrototype clone();
    public void setEngine(ScorpioEngine scorpioEngine);
    public void start();
}
