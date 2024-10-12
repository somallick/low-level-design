package com.design.pattern.structural.composite.example2;

// Component
public interface UIComponent {
    void draw();
    void add(UIComponent component);
    void remove(UIComponent component);
}
