package src.design.pattern.structural.decorator.example2;

/*
* Concrete Decorators - These classes extend the PizzaDecorator and add specific toppings.
*/
public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5; // Cost of cheese topping
    }
}
