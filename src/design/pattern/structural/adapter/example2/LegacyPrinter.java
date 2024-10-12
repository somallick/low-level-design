package src.design.pattern.structural.adapter.example2;

/*
* Adaptee
* Description: The existing class or system with an incompatible interface that needs to be integrated into the new system.
* Role: It’s the class or system that the client code cannot directly use due to interface mismatches.
*/
public class LegacyPrinter {
    public void printDocument(){
        System.out.println("Legacy printer is printing a document");
    }
}
