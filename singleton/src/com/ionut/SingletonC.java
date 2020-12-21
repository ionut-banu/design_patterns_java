package com.ionut;
//eager singleton
public class SingletonC {
    private static SingletonC uniqueInstance = new SingletonC();

    private SingletonC() {

    }

    public static SingletonC getInstance() {
        return uniqueInstance;
    }
}
