package com.example.designpattern.strategy.duck;

import com.example.designpattern.strategy.duck.attribute.fly.FlyBehavior;
import com.example.designpattern.strategy.duck.attribute.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected int age;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, int age) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.age = age;
    }

    public abstract void display();

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜오리도 뜹니다.");
    }

    public void sayAge() {
        System.out.println("제 나이는 "+this.age+"살 입니다.");
    }

    public void changeFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void changeQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        if(flyBehavior == null){
            System.out.println("비행 속성이 설정되어있지 않습니다. 설정해주세요.");
            return;
        }
        flyBehavior.fly();
    }

    public void performQuack() {
        if(quackBehavior == null){
            System.out.println("울음 속성이 설정되어있지 않습니다. 설정해주세요.");
            return;
        }
        quackBehavior.quack();
    }

    public void actAll() {
        display();
        swim();
        sayAge();
        performFly();
        performQuack();
    }
}
