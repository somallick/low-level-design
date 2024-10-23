package src.design.pattern.structural.facade.example1;

import src.design.pattern.structural.facade.example1.model.BothVegNonVeg;
import src.design.pattern.structural.facade.example1.model.Menus;

//Subsystem classes
public class VegNonVegBothRestaurant implements Hotel{
    @Override
    public Menus getMenu() {
        return new BothVegNonVeg();
    }
}
