package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;

public class BrakeVisitor implements IBrakeVisitor {
    @Override
    public String playSound(StandardBrake standardBrake) {
        return "standard brake ki sound";
    }

    @Override
    public String playSound(AdvancedBrake advancedBrake) {
        return "advanced brake ki sound";
    }
}
