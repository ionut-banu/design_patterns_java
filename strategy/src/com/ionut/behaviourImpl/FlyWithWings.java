package com.ionut.behaviourImpl;

import com.ionut.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying!!!");
    }
}
