package com.ionut.decorator;

import com.ionut.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription();
}
