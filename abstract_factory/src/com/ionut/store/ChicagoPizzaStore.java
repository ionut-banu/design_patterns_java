package com.ionut.store;

import com.ionut.factory.ChicagoPizzaIngredientFactory;
import com.ionut.factory.PizzaIngredientFactory;
import com.ionut.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.name = "Chicago Style Cheese Pizza";
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.name = "Chicago Style Pepperoni Pizza";
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.name = "Chicago Style Clam Pizza";
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.name = "Chicago Style Veggie Pizza";
        }
        return pizza;
    }
}
