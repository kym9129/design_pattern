package com.example.designpattern.decorator.coffee.menu;

import com.example.designpattern.decorator.coffee.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        super.setDescription("에스프레소");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
