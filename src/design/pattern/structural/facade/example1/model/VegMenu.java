package src.design.pattern.structural.facade.example1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VegMenu implements Menus{
    @Override
    public List<String> getListOfItems() {
        return Arrays.asList("Vegetable Stir Fry", "Paneer Tikka", "Caesar Salad");
    }
}
