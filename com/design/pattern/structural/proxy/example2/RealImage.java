package com.design.pattern.structural.proxy.example2;

/*
* RealSubject: The RealImage class represents the real object that the proxy will control access to.
* It implements the Image interface, providing concrete implementations for loading and displaying images from disk.
* The constructor initializes the image file name, and the display() method is responsible for loading the image
* if not already loaded and then displaying it.
*/
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(); // loaded for new instance creation
    }

    public void loadImageFromDisk() {
        System.out.println("Loading Image: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying Image: " + fileName);
    }
}
