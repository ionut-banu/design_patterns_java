package com.ionut;

//synchronized singleton
public class SingletonB {
    private static SingletonB uniqueInstance;

    private SingletonB() {
    }

    public static synchronized SingletonB getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonB();
        }
        return uniqueInstance;
    }
}
