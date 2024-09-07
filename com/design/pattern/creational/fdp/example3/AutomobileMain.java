package com.design.pattern.creational.fdp.example3;

import java.util.ArrayList;
import java.util.Collection;

public class AutomobileMain {
    public static void main(String[] args) {
        Collection<Scorpio> list =  new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        list.add(car1);
        list.add(car2);

        for(Scorpio car: list) {
            car.driveCar();
        }
    }
}
