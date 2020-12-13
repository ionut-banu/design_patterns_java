package com.ionut;

import com.ionut.behaviourImpl.FlyWithWings;
import com.ionut.behaviourImpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void performFly() {
        flyBehaviour.fly();
    }

    @Override
    public void performQuack() {
        quackBehaviour.quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
