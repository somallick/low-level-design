package src.design.pattern.creational.singleton;

public class SingletonDoubleLock {
    private static volatile SingletonDoubleLock singletonInstance = null;
    private SingletonDoubleLock(){}
    public static SingletonDoubleLock getInstance() {
        if (singletonInstance == null)
            // To make thread safe
            synchronized (SingletonDoubleLock.class) {
                // check again as multiple threads
                // can reach above step
                if(singletonInstance == null) {
                    singletonInstance = new SingletonDoubleLock();
                }
            }
        return singletonInstance;
    }
}

/*
* Declared the obj volatile which ensures that multiple threads offer the obj variable correctly
* when it is being initialized to the Singleton instance.
* This method drastically reduces the overhead of calling the synchronized method every time.
*/
