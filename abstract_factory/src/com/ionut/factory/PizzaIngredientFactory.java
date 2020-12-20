package com.ionut.factory;

import com.ionut.ingredients.cheese.Cheese;
import com.ionut.ingredients.clams.Clams;
import com.ionut.ingredients.dough.Dough;
import com.ionut.ingredients.pepperoni.Pepperoni;
import com.ionut.ingredients.sauce.Sauce;
import com.ionut.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
