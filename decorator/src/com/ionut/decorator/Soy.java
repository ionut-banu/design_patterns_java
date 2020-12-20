package com.ionut.decorator;

import com.ionut.beverage.Beverage;

public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost =  beverage.cost() + .15;
        switch (getSize()) {
            case TALL:
                cost += .10;
            case GRANDE:
                cost += .15;
            case VENTI:
                cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
