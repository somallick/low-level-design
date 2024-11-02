package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;

public class StandardScorpio implements IScorpio {


    @Override
    public String whatYourName() {
        return "Standard Scorpio";
    }

    @Override
    public void applyBrake(Brake brake) {
        System.out.println(whatYourName() + " ne mara standard brake aur nikla " + brake.apply(new BrakeVisitor()));
    }
}
