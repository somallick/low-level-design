package src.design.pattern.behavioral.visitor.example1;

public interface ICar {

//    Import function for double dispatch POV
    public void accept(ICarVisitor carVisitor);
}
