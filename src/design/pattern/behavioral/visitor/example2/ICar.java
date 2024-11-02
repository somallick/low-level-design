package src.design.pattern.behavioral.visitor.example2;

public interface ICar {

//    Import function for double dispatch POV
    public void accept(ICarVisitor carVisitor);
}
