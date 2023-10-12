package com.example.designpattern.duck;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("어푸어푸");
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
