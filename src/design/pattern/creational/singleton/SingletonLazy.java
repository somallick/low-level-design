package src.design.pattern.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy singletonInstance;
    private SingletonLazy(){
        System.out.println("Constructor k andar hu for instance creation");
    }
    private static class SingletonInner {
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }
    public static SingletonLazy getInstance(){
        return SingletonInner.INSTANCE;
    }
}

/*
* NOTE - In the above code, we are having a private static inner class SingletonInner
* and having private field. Through, getInstance() method of singleton class,
* we will access the field of inner class, and due to being inner class,
* it will be loaded only one time at the time of accessing the INSTANCE field first time.
* And the INSTANCE is a static member due to which it will be initialized only once.
*/

/*
* Classes are loaded only one time in memory by JDK.
* Inner classes in java are loaded in memory by JDK when it comes into scope of usage.
* It means that if we are not performing any action with inner class in our codebase,
* JDK will not load that inner class into memory. It is loaded only when this is being used somewhere.
*/
