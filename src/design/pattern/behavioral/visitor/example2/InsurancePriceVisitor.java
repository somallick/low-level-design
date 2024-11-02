package src.design.pattern.behavioral.visitor.example2;

public class InsurancePriceVisitor implements ICarVisitor{
    @Override
    public void visit(Scorpio scorpio) {
        System.out.println("I'm visiting insurance Scorpio");
    }
    @Override
    public void visit(Alto alto) {
        System.out.println("I'm visiting insurance Alto");
    }
}
