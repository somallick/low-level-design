package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;

public interface IBrakeVisitor {
    String playSound(StandardBrake standardBrake);
    String playSound(AdvancedBrake advancedBrake);
}
