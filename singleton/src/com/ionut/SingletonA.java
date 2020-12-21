package com.ionut;

//classic singleton
public class SingletonA {
    private static SingletonA uniqueInstance;

    private SingletonA() {
    }

    public static SingletonA getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonA();
        }
        return uniqueInstance;
    }
}
