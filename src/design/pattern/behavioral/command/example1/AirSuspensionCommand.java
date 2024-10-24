package src.design.pattern.behavioral.command.example1;

public class AirSuspensionCommand implements Command{

//    Has a relationship with the receiver
    AirSuspensionMechanism airSuspensionMechanism;

    public AirSuspensionCommand(AirSuspensionMechanism airSuspensionMechanism) {
        this.airSuspensionMechanism = airSuspensionMechanism;
    }

    @Override
    public void execute() {
        airSuspensionMechanism.liftSuspension();
    }
}
