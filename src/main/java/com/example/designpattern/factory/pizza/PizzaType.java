package com.example.designpattern.factory.pizza;

import lombok.Getter;

@Getter
public enum PizzaType {
    CHEESE("치즈"), GREEK("그리스"), PEPPERONI("페퍼로니"), CLAM("조개");

    private String value;

    PizzaType(String value) {
        this.value = value;
    }
}
