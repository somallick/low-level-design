package src.design.pattern.behavioral.visitor.double_dispatch_issue_case;

public class AdvancedBrake extends StandardBrake{
    @Override
    public String playSound() {
        return "advanced brake ki sound";
    }
}
