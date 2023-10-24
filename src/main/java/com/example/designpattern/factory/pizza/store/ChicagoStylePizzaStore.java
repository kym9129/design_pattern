package com.example.designpattern.factory.pizza.store;

import com.example.designpattern.factory.pizza.PizzaType;
import com.example.designpattern.factory.pizza.menu.*;
import com.example.designpattern.factory.pizza.menu.chicago.ChicagoStyleCheesePizza;
import com.example.designpattern.factory.pizza.menu.chicago.ChicagoStyleClamPizza;
import com.example.designpattern.factory.pizza.menu.chicago.ChicagoStyleGreekPizza;
import com.example.designpattern.factory.pizza.menu.chicago.ChicagoStylePepperoniPizza;
import com.example.designpattern.factory.pizza.menu.ny.NYStyleClamPizza;
import com.example.designpattern.factory.pizza.menu.ny.NYStyleGreekPizza;
import com.example.designpattern.factory.pizza.menu.ny.NYStylePepperoniPizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    private final String PREFIX = "시카고 스타일";

    @Override
    public Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new ChicagoStyleCheesePizza(PREFIX, PizzaType.CHEESE.getValue());
        } else if (type == PizzaType.GREEK ) {
            return new ChicagoStyleGreekPizza(PREFIX, PizzaType.GREEK.getValue());
        } else if (type == PizzaType.PEPPERONI ) {
            return new ChicagoStylePepperoniPizza(PREFIX, PizzaType.PEPPERONI.getValue());
        } else if (type == PizzaType.CLAM ) {
            return new ChicagoStyleClamPizza(PREFIX, PizzaType.CLAM.getValue());
        }
        return null;
    }
}
