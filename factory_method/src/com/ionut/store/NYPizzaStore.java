package com.ionut.store;

import com.ionut.pizza.Pizza;
import com.ionut.pizza.new_york.NYStyleCheesePizza;
import com.ionut.pizza.new_york.NYStyleClamPizza;
import com.ionut.pizza.new_york.NYStylePepperoniPizza;
import com.ionut.pizza.new_york.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
