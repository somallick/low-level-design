package src.design.pattern.structural.decorator.example1;

//Concrete Component
public class Scorpio implements ICar{


    @Override
    public void start() {
        System.out.println("Scorpio started");
    }

    @Override
    public void stop() {
        System.out.println("Scorpio stopped");
    }

    @Override
    public String getDescription() {
        return ("This is a scorpio model");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
