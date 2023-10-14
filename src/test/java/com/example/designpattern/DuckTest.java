package com.example.designpattern;

import com.example.designpattern.strategy.duck.DecoyDuck;
import com.example.designpattern.strategy.duck.Duck;
import com.example.designpattern.strategy.duck.MallarDuck;
import com.example.designpattern.strategy.duck.RubberDuck;
import com.example.designpattern.strategy.duck.attribute.fly.FlyNoWay;
import com.example.designpattern.strategy.duck.attribute.fly.FlyRocketPowered;
import com.example.designpattern.strategy.duck.attribute.fly.FlyWithWings;
import com.example.designpattern.strategy.duck.attribute.quack.MuteQuack;
import com.example.designpattern.strategy.duck.attribute.quack.Quack;
import com.example.designpattern.strategy.duck.attribute.quack.Squack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DuckTest {

    Quack quack = new Quack();
    Squack squack = new Squack();
    MuteQuack muteQuack = new MuteQuack();

    FlyWithWings flyWithWings = new FlyWithWings();
    FlyNoWay flyNoWay = new FlyNoWay();
    FlyRocketPowered flyRocketPowered = new FlyRocketPowered();

    @Test
    @DisplayName("오리 객체 생성")
    void create_ducks() {

        MallarDuck mallarDuck = new MallarDuck(flyWithWings, quack, 1);
        RubberDuck rubberDuck = new RubberDuck(flyNoWay, squack, 2);
        DecoyDuck decoyDuck = new DecoyDuck(flyNoWay, muteQuack, 3);

        List<Duck> duckList = Arrays.asList(mallarDuck, rubberDuck, decoyDuck);
        for(Duck duck : duckList) {
            duck.actAll();
            System.out.println("------------");
        }

    }

    @Test
    @DisplayName("고무오리 속성 변경: 소리안나게, 로켓타고 날게")
    void change_attribute() {
        RubberDuck rubberDuck = new RubberDuck(flyNoWay, squack, 2);

        System.out.println("--before--");
        rubberDuck.performFly();
        rubberDuck.performQuack();

        rubberDuck.changeFlyBehavior(flyRocketPowered);
        rubberDuck.changeQuackBehavior(muteQuack);

        System.out.println("----after----");
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
