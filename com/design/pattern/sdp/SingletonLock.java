package com.design.pattern.sdp;

public class SingletonLock {
    private static SingletonLock singletonInstance;
    private SingletonLock(){}
    public static synchronized SingletonLock getInstance() {
        if (singletonInstance == null)
            singletonInstance = new SingletonLock();
        return singletonInstance;
    }
}
