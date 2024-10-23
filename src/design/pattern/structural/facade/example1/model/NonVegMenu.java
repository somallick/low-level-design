package src.design.pattern.structural.facade.example1.model;

import java.util.Arrays;
import java.util.List;

public class NonVegMenu implements Menus{

    @Override
    public List<String> getListOfItems() {
        return Arrays.asList("Chicken Curry", "Grilled Salmon", "Beef Steak");
    }
}
