package com.design.pattern.structural.proxy.example2;

/*
* Subject: The Image interface declares the common methods for displaying images,
* acting as a blueprint for both the real and proxy objects.
* In this design, it defines the display() method that both RealImage and ProxyImage must implement.
* This ensures a uniform interface for clients interacting with image objects.
*/
public interface Image {
    void display();
}
