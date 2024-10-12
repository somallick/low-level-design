package src.design.pattern.structural.decorator.example2;

/*
 * Concrete Decorators - These classes extend the PizzaDecorator and add specific toppings.
 */
public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushrooms";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0; // Cost of mushroom topping
    }
}
