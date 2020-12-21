package com.ionut;
//double-checked lock singleton
public class SingletonD {
    private volatile static SingletonD uniqueInstance;

    private SingletonD() {
    }

    public static SingletonD getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonD.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonD();
                }
            }
        }
        return uniqueInstance;
    }

}

