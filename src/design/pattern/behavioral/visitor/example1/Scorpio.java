package src.design.pattern.behavioral.visitor.example1;

public class Scorpio implements ICar{
    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visitScorpio(this);
    }
}
