package com.example.designpattern.factory.pizza.store;

import com.example.designpattern.factory.pizza.*;
import com.example.designpattern.factory.pizza.menu.*;
import com.example.designpattern.factory.pizza.menu.ny.NYStyleCheesePizza;
import com.example.designpattern.factory.pizza.menu.ny.NYStyleClamPizza;
import com.example.designpattern.factory.pizza.menu.ny.NYStyleGreekPizza;
import com.example.designpattern.factory.pizza.menu.ny.NYStylePepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {
    private final String PREFIX = "뉴욕 스타일";
    @Override
    public Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new NYStyleCheesePizza(PREFIX, PizzaType.CHEESE.getValue());
        } else if (type == PizzaType.GREEK ) {
            return new NYStyleGreekPizza(PREFIX, PizzaType.GREEK.getValue());
        } else if (type == PizzaType.PEPPERONI ) {
            return new NYStylePepperoniPizza(PREFIX, PizzaType.PEPPERONI.getValue());
        } else if (type == PizzaType.CLAM ) {
            return new NYStyleClamPizza(PREFIX, PizzaType.CLAM.getValue());
        }
        return null;
    }
}
