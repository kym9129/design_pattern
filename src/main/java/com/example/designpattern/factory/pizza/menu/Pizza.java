package com.example.designpattern.factory.pizza.menu;

import lombok.Getter;

@Getter
public class Pizza {
    private String name;

    public Pizza(String prefix, String typeName) {
        this.name = prefix + " " + typeName + " 피자";
    }

    public void prepare() {
        System.out.println(name + " 준비");
    }

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
