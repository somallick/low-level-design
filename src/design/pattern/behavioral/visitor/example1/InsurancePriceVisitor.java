package src.design.pattern.behavioral.visitor.example1;

public class InsurancePriceVisitor implements ICarVisitor{
    @Override
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("I'm visiting insurance Scorpio");
    }
    @Override
    public void visitAlto(Alto alto) {
        System.out.println("I'm visiting insurance Alto");
    }
}
