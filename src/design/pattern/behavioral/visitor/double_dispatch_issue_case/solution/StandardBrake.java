package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;

public class StandardBrake implements Brake{
    @Override
    public String apply(IBrakeVisitor visitor) {
        return visitor.playSound(this);
    }
}
