package src.design.pattern.behavioral.command.example1;

public class BrakeCommand implements Command{
//  Has a relationship with the receiver
    BrakeMechanism brakeMechanism;

    public BrakeCommand(BrakeMechanism brakeMechanism) {
        this.brakeMechanism = brakeMechanism;
    }

    @Override
    public void execute() {
        brakeMechanism.applyBrake();
    }
}
