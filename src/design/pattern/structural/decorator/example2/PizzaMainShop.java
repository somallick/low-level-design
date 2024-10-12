package src.design.pattern.structural.decorator.example2;

/*
* Imagine a pizza shop where customers can customize their pizzas with various toppings like cheese, pepperoni, mushrooms, and olives.
* The goal is to create a flexible system that allows you to dynamically add any combination of toppings to a base pizza
* without modifying the existing pizza classes or creating numerous subclasses.
*/
public class PizzaMainShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}
