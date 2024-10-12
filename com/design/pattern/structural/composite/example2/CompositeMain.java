package com.design.pattern.structural.composite.example2;

//Client
public class CompositeMain {
    public static void main(String[] args) {
        UIComponent buttonLeaf = new Button();
        buttonLeaf.draw();

        UIComponent component = new Menu();
        //Addition
        System.out.println("After Addition in Menu");
        Circle circleObj1 = new Circle();
        component.add(circleObj1);
        Rectangle rectangleObj1 = new Rectangle();
        component.add(rectangleObj1);
        Circle circleObj2 = new Circle();
        component.add(circleObj2);
        component.draw();
        //Removal
        System.out.println("After Removal from Menu");
        component.remove(circleObj2);
        component.draw();
    }
}

/*
* Less number of objects reduces the memory usage,
* and it manages to keep us away from errors related to memory like java.lang.OutOfMemoryError.
* Although creating an object in Java is really fast,
* we can still reduce the execution time of our program by sharing objects.
*/
