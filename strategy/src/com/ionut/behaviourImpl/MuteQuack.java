package com.ionut.behaviourImpl;

import com.ionut.behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
