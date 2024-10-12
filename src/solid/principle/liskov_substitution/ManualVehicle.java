package src.solid.principle.liskov_substitution;

public abstract class ManualVehicle implements Vehicle {
    public void startMoving() {
        System.out.println(this.getClass().getName()+ " has started moving...");
    }
}
