package src.design.pattern.behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

public class Panel {

    List<Command> commandList = new ArrayList<>();

    public Panel() {
    }

    public void setCommand(int index, Command command){
        commandList.add(index,command);
    }

    public void liftSuspension() {
        commandList.get(0).execute();
    }

    public void applyBrake() {
        commandList.get(1).execute();
    }

}
