package com.design.pattern.creational.bdp.example1.model;

public class Scorpio implements ICar {
    String model;
    String engine;
    String bodyShell;
    String tyre;

    public Scorpio() {
    }

    public Scorpio(Scorpio scorpio) {
        this.setModel(scorpio.model);
        this.setEngine(scorpio.engine);
        this.setBodyShell(scorpio.bodyShell);
        this.setTyre(scorpio.tyre);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBodyShell(String bodyShell) {
        this.bodyShell = bodyShell;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Scorpio{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", bodyShell='" + bodyShell + '\'' +
                ", tyre='" + tyre + '\'' +
                '}';
    }
}
