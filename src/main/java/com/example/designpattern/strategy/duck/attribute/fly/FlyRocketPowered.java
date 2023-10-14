package com.example.designpattern.strategy.duck.attribute.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 타고 날아갑니다 슝~");
    }
}
