package com.example.designpattern.decorator.coffee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
    private String description = "제목 없음";

    //    public String getDescription() {
//        return description;
//    }

    public abstract double cost();
}
