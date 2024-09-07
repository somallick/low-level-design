package com.design.pattern.structural.adapter.example2;

/*
* Adapter
* Description: A class that implements the target interface and internally uses an instance of the adaptee to make it compatible with the target interface.
* Role: It acts as a bridge, adapting the interface of the adaptee to match the target interface.
*/
public class Adapter implements Printer{
    LegacyPrinter legacyPrinter;

    public Adapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}
