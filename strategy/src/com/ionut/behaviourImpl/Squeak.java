package com.ionut.behaviourImpl;

import com.ionut.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!!!");
    }
}
