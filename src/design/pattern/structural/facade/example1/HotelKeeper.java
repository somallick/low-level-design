package src.design.pattern.structural.facade.example1;

import src.design.pattern.structural.facade.example1.model.Menus;

public interface HotelKeeper {
    public Menus getVegMenu();
    public Menus getNonVegMenu();
    public Menus getVegNonVegBothMenu();
}
