package com.ionut;

import com.ionut.behaviourImpl.MuteQuack;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setQuackBehaviour(new MuteQuack());
        mallard.performQuack();
    }

}
