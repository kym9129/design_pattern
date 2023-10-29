package com.example.designpattern.factory.pizza.menu;

import com.example.designpattern.factory.pizza.ingredient.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pizza {
    private String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public Pizza(String prefix, String typeName) {
        this.name = prefix + " " + typeName + " 피자";
    }

    public void prepare() {
        System.out.println(name + " 준비 중...");
    };

    public void bake() {
        System.out.println(name + " 굽는 중...");
    }

    public void cut() {
        System.out.println(name + " 컷팅 중...");
    }

    public void box() {
        System.out.println(name + " 포장 중...");
    }
}
