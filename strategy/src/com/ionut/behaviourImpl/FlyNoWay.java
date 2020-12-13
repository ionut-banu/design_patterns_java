package com.ionut.behaviourImpl;

import com.ionut.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Not flying!");
    }
}
