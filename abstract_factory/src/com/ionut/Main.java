package com.ionut;

import com.ionut.store.ChicagoPizzaStore;
import com.ionut.store.NYPizzaStore;
import com.ionut.store.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");

        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
