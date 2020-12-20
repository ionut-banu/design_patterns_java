package com.ionut.pizza;

import com.ionut.ingredients.cheese.Cheese;
import com.ionut.ingredients.clams.Clams;
import com.ionut.ingredients.dough.Dough;
import com.ionut.ingredients.pepperoni.Pepperoni;
import com.ionut.ingredients.sauce.Sauce;
import com.ionut.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;

    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public List<String> toppings = new ArrayList<>();
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStoreBox");
    }

}