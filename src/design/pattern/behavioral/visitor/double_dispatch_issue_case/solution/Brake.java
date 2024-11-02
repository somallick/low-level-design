package src.design.pattern.behavioral.visitor.double_dispatch_issue_case.solution;

public interface Brake {
    public String apply(IBrakeVisitor visitor);
}
