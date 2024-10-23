package src.design.pattern.structural.facade.example1;

import src.design.pattern.structural.facade.example1.model.Menus;

// Facade (Compiler)
public class HotelKeeperImplementation implements HotelKeeper{
    @Override
    public Menus getVegMenu() {
        VegRestaurant vr = new VegRestaurant();
        return vr.getMenu();
    }

    @Override
    public Menus getNonVegMenu() {
        NonVegRestaurant nvr = new NonVegRestaurant();
        return nvr.getMenu();
    }

    @Override
    public Menus getVegNonVegBothMenu() {
        VegNonVegBothRestaurant vnvbr = new VegNonVegBothRestaurant();
        return vnvbr.getMenu();
    }
}

/*
* The complex implementation will be done by HotelKeeper himself.
* The client will just access the HotelKeeper and ask for either
* Veg, NonVeg or VegNon Both Restaurant menu.
*/
