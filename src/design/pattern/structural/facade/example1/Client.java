package src.design.pattern.structural.facade.example1;

import src.design.pattern.structural.facade.example1.model.Menus;

/*
* Let’s consider a hotel. This hotel has a hotel keeper.
* There are a lot of restaurants inside the hotel e.g. Veg restaurants, Non-Veg restaurants, and Veg/Non Both restaurants.
* You, as a client want access to different menus of different restaurants.
* You do not know what are the different menus they have. You just have access to a hotel keeper who knows his hotel well.
* Whichever menu you want, you tell the hotel keeper, and he takes it out of the respective restaurants and hands it over to you.
*/

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeperImplementation();
        Menus v = hotelKeeper.getVegMenu();
        System.out.println("Veg Menu : " + v.getListOfItems());
        v = hotelKeeper.getNonVegMenu();
        System.out.println("Non Veg Menu : " + v.getListOfItems());
        v = hotelKeeper.getVegNonVegBothMenu();
        System.out.println("Both Menu : " + v.getListOfItems());
    }
}
