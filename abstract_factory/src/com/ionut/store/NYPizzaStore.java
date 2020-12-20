package com.ionut.store;

import com.ionut.factory.NYPizzaIngredientFactory;
import com.ionut.factory.PizzaIngredientFactory;
import com.ionut.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.name = "New York Style Cheese Pizza";
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.name = "New York Style Pepperoni Pizza";
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.name = "New York Style Clam Pizza";
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.name = "New York Style Veggie Pizza";
        }
        return pizza;
    }
}
