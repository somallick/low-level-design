package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.problem;

public class AdvancedBrake extends StandardBrake{
    @Override
    public String playSound() {
        return "advanced brake ki sound";
    }
}
