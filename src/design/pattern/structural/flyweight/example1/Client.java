package src.design.pattern.structural.flyweight.example1;

/*
* Imagine a graphical user interface (GUI) application where multiple icons of different types
* (e.g., file icons, folder icons) need to be displayed on a screen.
* Each icon type has a specific appearance and behavior, such as different images and positions on the screen.
* However, displaying numerous icons of the same type can consume significant memory
* if each icon object stores its unique properties independently.
*/

// Client code to use the flyweight objects (icons)
public class Client {
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();

        // Draw file icons at different positions
        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(100, 100);

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(150, 150);

        // Draw folder icons at different positions
        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(200, 200);

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(250, 250);
    }
}

/*
* Flyweight Design Pattern will help in this problem situation:
*
* The Flyweight design pattern can optimize memory usage by sharing common parts of the icons (intrinsic state),
* such as the image and basic properties (like size and color), among multiple icon instances.
*
* Each icon instance then stores only its unique properties (extrinsic state), such as its position on the screen.
*
* This approach reduces the memory footprint and enhances performance, especially when dealing with a large number of similar objects.
*/
