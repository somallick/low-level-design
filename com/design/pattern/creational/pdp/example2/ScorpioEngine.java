package com.design.pattern.creational.pdp.example2;

public class ScorpioEngine {
    private String engineName;
    public ScorpioEngine() {
        System.out.println(this.getClass().getName() + " - ScorpioEngine create hoyeche");
        this.engineName = "Scorpio Default Engine";
    }
    public ScorpioEngine(ScorpioEngine scorpioEngine) {
        System.out.println(this.getClass().getName() + " - ScorpioEngine create hoyeche with another engine name");
        this.engineName = scorpioEngine.engineName;
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
