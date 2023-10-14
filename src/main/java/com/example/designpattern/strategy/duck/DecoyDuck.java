package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.duck.attribute.fly.FlyNoWay;
import com.example.designpattern.strategy.duck.attribute.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(FlyNoWay flyNoWay, MuteQuack muteQuack, int age) {
        super(flyNoWay, muteQuack, age);
    }

    @Override
    public void display() {
        System.out.println("저는 가짜오리 입니다.");
    }
}
