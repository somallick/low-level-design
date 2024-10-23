package src.design.pattern.creational.factory.example1;

public abstract class  Vehicle
{
    String name;
    int seatingCap;
    abstract int getSeatingCapacity();
    abstract String getDiscription();
}