package com.ionut;

import com.ionut.behaviour.QuackBehaviour;
import com.ionut.behaviour.FlyBehaviour;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public abstract void performFly();
    public abstract void performQuack();

    public abstract void display();

    public void swim(){
        System.out.println("All duck float.");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
