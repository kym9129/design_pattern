package com.example.designpattern.factory.pizza.store;

import com.example.designpattern.factory.pizza.menu.Pizza;
import com.example.designpattern.factory.pizza.PizzaType;

public abstract class PizzaStore {
//    private final SimplePizzaFactory pizzaFactory;
//
//    public PizzaStore(SimplePizzaFactory factory) {
//        this.pizzaFactory = factory;
//    }

    public abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("주문하신 "+pizza.getName()+" 나왔습니다.");

        return pizza;
    }
}
