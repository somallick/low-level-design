package src.design.pattern.structural.decorator.example2;

/*
* Concrete Component - This class implements the Pizza interface
* and provides the basic implementation for a plain pizza.
*/
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double cost() {
        return 8.0; // Base price of the pizza
    }
}
