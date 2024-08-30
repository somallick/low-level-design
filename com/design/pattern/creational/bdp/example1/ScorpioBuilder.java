package com.design.pattern.creational.bdp.example1;

import com.design.pattern.creational.bdp.example1.model.ICar;
import com.design.pattern.creational.bdp.example1.model.Scorpio;

public class ScorpioBuilder implements ICarBuilder {
    private Scorpio scorpio;
    public ScorpioBuilder(){
        scorpio = new Scorpio();
    }
    @Override
    public ICarBuilder buildModel(String model) {
        this.scorpio.setModel(model);
        return this;
    }

    @Override
    public ICarBuilder buildEngine(String engine) {
        this.scorpio.setEngine(engine);
        return this;
    }

    @Override
    public ICarBuilder buildBodyShell(String bodyShell) {
        this.scorpio.setBodyShell(bodyShell);
        return this;
    }

    @Override
    public ICarBuilder buildTyre(String tyre) {
        this.scorpio.setTyre(tyre);
        return this;
    }

    @Override
    public ICar build() {
        return new Scorpio(this.scorpio);
    }
}
