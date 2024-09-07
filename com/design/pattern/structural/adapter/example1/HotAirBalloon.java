package com.design.pattern.structural.adapter.example1;

/*
* Adaptee
*/
public class HotAirBalloon {
    private String gasUsed = "Helium";
    void start(String gasUsed) {
        System.out.println("Hot Air Balloon is stated by " + gasUsed);
    }
    public String getGasUsed(){
        return gasUsed;
    }
}
