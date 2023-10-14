package com.example.designpattern.strategy.duck.attribute.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
