package com.ionut.factory;

import com.ionut.ingredients.cheese.Cheese;
import com.ionut.ingredients.cheese.MozzarellaCheese;
import com.ionut.ingredients.clams.Clams;
import com.ionut.ingredients.clams.FreshClams;
import com.ionut.ingredients.clams.FrozenClams;
import com.ionut.ingredients.dough.Dough;
import com.ionut.ingredients.dough.ThinCrustDough;
import com.ionut.ingredients.pepperoni.Pepperoni;
import com.ionut.ingredients.pepperoni.SlicedPepperoni;
import com.ionut.ingredients.sauce.PlumTomatoSauce;
import com.ionut.ingredients.sauce.Sauce;
import com.ionut.ingredients.veggies.BlackOlives;
import com.ionut.ingredients.veggies.EggPlant;
import com.ionut.ingredients.veggies.Spinach;
import com.ionut.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Spinach(), new BlackOlives(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
