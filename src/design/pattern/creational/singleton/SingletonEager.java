package src.design.pattern.creational.singleton;

// Static initializer based Java implementation of singleton design pattern
public class SingletonEager {
    public static SingletonEager singletonInstance = new SingletonEager();
    private SingletonEager() {}
    public static SingletonEager getInstance() {
        return singletonInstance;
    }
}

/*
* An instance of a singleton was created in a static initializer.
* JVM executes a static initializer when the class is loaded and hence this is guaranteed to be thread-safe.
* Use this method only when your singleton class is light and is used throughout the execution of your program.
*/
