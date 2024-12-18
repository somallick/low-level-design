package src.design.pattern.creational.builder.example1;

import src.design.pattern.creational.builder.example1.model.ICar;

public interface ICarBuilder {

    public ICarBuilder buildModel(String model);
    public ICarBuilder buildEngine(String engine);
    public ICarBuilder buildBodyShell(String bodyShell);
    public ICarBuilder buildTyre(String tyre);
    public ICar build();
}
