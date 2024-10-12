package src.design.pattern.structural.decorator.example2;

/*
 * Concrete Decorators - These classes extend the PizzaDecorator and add specific toppings.
 */
public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", pepperoni";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.0; // Cost of pepperoni topping
    }
}
