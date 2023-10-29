package com.example.designpattern;

import com.example.designpattern.decorator.coffee.*;
import com.example.designpattern.decorator.coffee.menu.Espresso;
import com.example.designpattern.decorator.coffee.menu.HouseBlend;
import com.example.designpattern.decorator.coffee.option.Milk;
import com.example.designpattern.decorator.coffee.option.Mocha;
import org.junit.jupiter.api.Test;

public class StarbuzzCoffeeTest {

    @Test
    void makeStarbuzzCoffee() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2); // 모캇 2샷. (감싸기)
        beverage2 = new Milk(beverage2); // 우유 추가 (감싸기)
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost()); // todo: 가격 $1.3900000000000001로 나오는 이슈 디버깅
    }

}
