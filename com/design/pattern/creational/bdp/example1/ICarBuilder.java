package com.design.pattern.creational.bdp.example1;

import com.design.pattern.creational.bdp.example1.model.ICar;

public interface ICarBuilder {

    public ICarBuilder buildModel(String model);
    public ICarBuilder buildEngine(String engine);
    public ICarBuilder buildBodyShell(String bodyShell);
    public ICarBuilder buildTyre(String tyre);
    public ICar build();
}
