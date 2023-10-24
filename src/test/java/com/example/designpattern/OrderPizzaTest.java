package com.example.designpattern;

import com.example.designpattern.factory.pizza.store.NYStylePizzaStore;
import com.example.designpattern.factory.pizza.store.PizzaStore;
import com.example.designpattern.factory.pizza.PizzaType;
import com.example.designpattern.factory.pizza.SimplePizzaFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderPizzaTest {
    @Test
    @DisplayName("피자를 주문하면 피자를 만든다.")
    void order_pizza() {
//        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("------");
        pizzaStore.orderPizza(PizzaType.GREEK);
        System.out.println("------");
        pizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("------");
        pizzaStore.orderPizza(PizzaType.CLAM);
        System.out.println("------");
        System.out.println("------");
        // todo: 시카고 스타일 피자 주문
    }
}
