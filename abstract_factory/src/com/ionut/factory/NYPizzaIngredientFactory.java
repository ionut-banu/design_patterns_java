package com.ionut.factory;

import com.ionut.ingredients.cheese.Cheese;
import com.ionut.ingredients.cheese.ReggianoCheese;
import com.ionut.ingredients.clams.Clams;
import com.ionut.ingredients.clams.FreshClams;
import com.ionut.ingredients.dough.Dough;
import com.ionut.ingredients.dough.ThinCrustDough;
import com.ionut.ingredients.pepperoni.Pepperoni;
import com.ionut.ingredients.pepperoni.SlicedPepperoni;
import com.ionut.ingredients.sauce.MarinaraSauce;
import com.ionut.ingredients.sauce.Sauce;
import com.ionut.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
