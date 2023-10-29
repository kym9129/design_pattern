package com.example.designpattern.decorator.coffee.option;

import com.example.designpattern.decorator.coffee.Beverage;
import com.example.designpattern.decorator.coffee.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
