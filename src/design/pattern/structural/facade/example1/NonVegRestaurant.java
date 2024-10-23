package src.design.pattern.structural.facade.example1;

import src.design.pattern.structural.facade.example1.model.Menus;
import src.design.pattern.structural.facade.example1.model.NonVegMenu;

//Subsystem classes
public class NonVegRestaurant implements Hotel{
    @Override
    public Menus getMenu() {
        return new NonVegMenu();
    }
}
