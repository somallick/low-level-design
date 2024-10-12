package src.design.pattern.structural.composite.example2;

//Leaf or Part
public class Circle implements UIComponent{
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public void add(UIComponent component) {
        System.out.println("Adding circle");
    }

    @Override
    public void remove(UIComponent component) {
        System.out.println("Removing circle");
    }
}
