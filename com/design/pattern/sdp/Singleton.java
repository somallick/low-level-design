package com.design.pattern.sdp;

public class Singleton {
    private static Singleton singletonInstance;
    private Singleton(){
        System.out.println("Constructor k andar hu for instance creation");
    }
    public static Singleton getInstance(){
        if(singletonInstance == null)
            singletonInstance = new Singleton();
        return singletonInstance;
    }
}

/*
* The main disadvantage of this method is that using synchronized every time while creating the singleton object is expensive
* and may decrease the performance of your program. However, if the performance of getInstance() is not critical for your application
* this method provides a clean and simple solution.
*/

/*
* NOTE: This pattern will break in case of multithreaded environment as due to context switch between thread,
* object can be created multiple times at once.
*/