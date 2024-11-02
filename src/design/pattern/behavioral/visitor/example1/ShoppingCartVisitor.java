package src.design.pattern.behavioral.visitor.example1;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
