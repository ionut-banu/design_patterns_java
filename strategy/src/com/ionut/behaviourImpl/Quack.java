package com.ionut.behaviourImpl;

import com.ionut.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
