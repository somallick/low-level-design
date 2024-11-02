package src.design.pattern.behavioral.visitor.example2;

public class Scorpio implements ICar{
    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
