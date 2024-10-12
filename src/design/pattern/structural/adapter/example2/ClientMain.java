package src.design.pattern.structural.adapter.example2;

/*
* Problem Statement
* Let’s consider a scenario where we have an existing system that uses a LegacyPrinter class with a method named printDocument()
* which we want to adapt into a new system that expects a Printer interface with a method named print().
*/
public class ClientMain {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer adapter = new Adapter(legacyPrinter);
        adapter.print();
    }
}
