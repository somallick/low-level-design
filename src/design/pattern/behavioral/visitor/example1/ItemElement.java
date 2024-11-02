package src.design.pattern.behavioral.visitor.example1;

/*
* Notice that accept method takes Visitor argument.
* We can have some other methods also specific for items
*/
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
