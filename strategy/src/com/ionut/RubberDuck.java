package com.ionut;

import com.ionut.behaviourImpl.FlyNoWay;
import com.ionut.behaviourImpl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
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
        System.out.println("Rubber duck");
    }
}
