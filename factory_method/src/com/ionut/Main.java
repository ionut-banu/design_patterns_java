package com.ionut;

import com.ionut.pizza.Pizza;
import com.ionut.store.ChicagoPizzaStore;
import com.ionut.store.NYPizzaStore;
import com.ionut.store.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.name + "\n") ;

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.name + "\n");
    }
}
