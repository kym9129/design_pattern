package com.example.designpattern.decorator.coffee.menu;

import com.example.designpattern.decorator.coffee.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super.setDescription("하우스블랜드");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
