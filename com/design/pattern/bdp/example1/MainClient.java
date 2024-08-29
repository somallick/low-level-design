package com.design.pattern.bdp.example1;

import com.design.pattern.bdp.example1.model.ICar;

public class MainClient {
    public static void main(String[] args) {
        ICarBuilder carBuilder = new ScorpioBuilder();
        ICar car1 = carBuilder.buildModel("S1")
                .buildEngine("E1")
                .buildBodyShell("Metal")
                .buildTyre("T1")
                .build();
        ICar car2 = carBuilder.buildModel("S2")
                .buildEngine("E2")
                .buildBodyShell("Metal")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }

}
