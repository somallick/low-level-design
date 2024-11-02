package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;

public class AdvancedScorpio implements IScorpio {

    @Override
    public String whatYourName() {
        return "Advanced Scorpio";
    }

    @Override
    public void applyBrake(Brake brake) {
        System.out.println(whatYourName() + " ne mara advanced brake aur nikla " + brake.apply(new BrakeVisitor()));
    }
}
