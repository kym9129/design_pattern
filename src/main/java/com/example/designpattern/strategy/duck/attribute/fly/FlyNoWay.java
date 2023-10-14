package com.example.designpattern.strategy.duck.attribute.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날지 못해요");
    }
}
