package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.duck.attribute.fly.FlyWithWings;
import com.example.designpattern.strategy.duck.attribute.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck(FlyWithWings flyWithWings, Quack quack, int age) {
        super(flyWithWings, quack, age);
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
