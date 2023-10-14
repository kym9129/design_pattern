package com.example.designpattern.strategy.duck.attribute.quack;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
