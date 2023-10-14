package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.duck.attribute.fly.FlyNoWay;
import com.example.designpattern.strategy.duck.attribute.quack.Squack;

public class RubberDuck extends Duck {

    public RubberDuck(FlyNoWay flyNoWay, Squack squack, int age) {
        super(flyNoWay, squack, age);
    }

    @Override
    public void display() {
        System.out.println("저는 고무오리 입니다.");
    }
}
