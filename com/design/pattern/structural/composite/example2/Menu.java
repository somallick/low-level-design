package com.design.pattern.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

/*
* Composite or Whole
* It contains many parts(leaf child node) or whole node
*/
public class Menu implements UIComponent{
    List<UIComponent> children = new ArrayList<>();

    @Override
    public void draw() {
        for(UIComponent child:children){
            child.draw(); // will call the leaf or child node draw() function
        }
    }

    @Override
    public void add(UIComponent component) {
        children.add(component);
    }

    @Override
    public void remove(UIComponent component) {
        children.remove(component);
    }
}
