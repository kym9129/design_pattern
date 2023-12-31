package com.example.designpattern.factory.pizza.menu.chicago;

import com.example.designpattern.factory.pizza.menu.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(String prefix, String typeName) {
        super(prefix, typeName);
    }

    @Override
    public void prepare() {
        System.out.println(super.getName() + "준비 중");
    }
}
