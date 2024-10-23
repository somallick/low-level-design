package src.design.pattern.structural.facade.example1;

import src.design.pattern.structural.facade.example1.model.Menus;
import src.design.pattern.structural.facade.example1.model.VegMenu;

//Subsystem classes
public class VegRestaurant implements Hotel{
    @Override
    public Menus getMenu() {
        return new VegMenu();
    }
}
