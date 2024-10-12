package src.design.pattern.creational.pdp.example1;

public class ScorpioEngine {
    private String engineName;
    public ScorpioEngine() {
        System.out.println("ScorpioEngine create hoyeche");
        engineName = "Scorpio Default Engine";
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public String toString() {
        return "ScorpioEngine{" +
                "engineName='" + engineName + '\'' +
                '}';
    }
}
