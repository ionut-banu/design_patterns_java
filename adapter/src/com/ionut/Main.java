package com.ionut;

import com.ionut.duck.Duck;
import com.ionut.duck.MallardDuck;
import com.ionut.turkey.WildTurkey;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says...");
        testDuck(duck);

        System.out.println("\nTurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
