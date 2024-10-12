package src.solid.principle.liskov_substitution;

public class Car extends MotorVehicle {
    @Override
    public void wheelCount() {
        System.out.println(this.getClass().getName() + " having 4 wheels...");
    }
}
