package src.design.pattern.structural.facade.example1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BothVegNonVeg implements Menus{

    @Override
    public List<String> getListOfItems() {
        List<String> vegDishes = Arrays.asList("Vegetable Biryani", "Tofu Stir Fry", "Greek Salad");
        List<String> nonVegDishes = Arrays.asList("Lamb Chops", "Shrimp Scampi", "Chicken Alfredo");
        List<String> bothDishes = new ArrayList<>();
        bothDishes.addAll(vegDishes);
        bothDishes.addAll(nonVegDishes);
        return bothDishes;
    }
}
