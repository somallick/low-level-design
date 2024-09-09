package com.design.pattern.structural.proxy.example2;

/*
* Proxy: The ProxyImage class acts as a surrogate for the RealImage.
* It also implements the Image interface, maintaining a reference to the real image object.
* The display() method in the proxy checks whether the real image has been loaded;
* if not, it creates a new instance of RealImage and delegates the display() call to it.
* This lazy loading mechanism ensures that the real image is loaded only when necessary.
*/
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName); // loaded only when necessary
        }
        realImage.display();
    }
}
