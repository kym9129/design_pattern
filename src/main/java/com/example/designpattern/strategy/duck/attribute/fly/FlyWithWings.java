package com.example.designpattern.strategy.duck.attribute.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날개로 날아요");
    }
}
