package src.design.pattern.creational.prototype.example1;

public class Scorpio implements IScorpioPrototype, Cloneable {
    private ScorpioEngine engine = new ScorpioEngine();

    // This creates a copy of the Scorpio.
    @Override
    public IScorpioPrototype clone() {
//        return new Scorpio();
        try {
            return (Scorpio)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setEngine(ScorpioEngine scorpioEngine) {
        this.engine = scorpioEngine;
    }

    @Override
    public void start() {
        System.out.println("Start hoyeche Scorpio");
    }

    @Override
    public String toString() {
        return "Scorpio{" +
                "engine=" + engine +
                '}';
    }
}
