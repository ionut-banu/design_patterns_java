package com.ionut.store;

import com.ionut.pizza.Pizza;
import com.ionut.pizza.chicago.ChicagoStyleCheesePizza;
import com.ionut.pizza.chicago.ChicagoStyleClamPizza;
import com.ionut.pizza.chicago.ChicagoStylePepperoniPizza;
import com.ionut.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
