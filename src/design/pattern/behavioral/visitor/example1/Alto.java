package src.design.pattern.behavioral.visitor.example1;

public class Alto implements ICar{
    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visitAlto(this);
    }
}
