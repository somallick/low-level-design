package src.design.pattern.behavioral.command.example1;

/*
* Design a control system for various mechanisms of a car, such as the brake mechanism and the suspension mechanism.
* The goal is to encapsulate different requests, allowing for flexible and modular control of these car mechanisms.
* This design will enable us to easily add new commands and mechanisms in the future, enhancing the scalability and maintainability of the system.
*/
public class CarMain {
    public static void main(String[] args) {

//        Setting up the system/panel
        Command airSuspensionCommand = new AirSuspensionCommand(new AirSuspensionMechanism());
        Command brakeCommand = new BrakeCommand(new BrakeMechanism());
        Panel buttonPanel = new Panel();
        buttonPanel.setCommand(0,airSuspensionCommand);
        buttonPanel.setCommand(1,brakeCommand);

//        Try different buttons in panel
        buttonPanel.liftSuspension();
        buttonPanel.applyBrake();
    }
}
