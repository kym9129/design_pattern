package com.example.designpattern.factory.pizza.menu.ny;

import com.example.designpattern.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.example.designpattern.factory.pizza.menu.Pizza;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(String prefix, String typeName, PizzaIngredientFactory ingredientFactory) {
        super(prefix, typeName);
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(super.getName() + "준비 중");
        super.setDough(ingredientFactory.createDough());
        super.setSauce(ingredientFactory.createSauce());
        super.setCheese(ingredientFactory.createCheese());
        super.setVeggies(ingredientFactory.creaeVeggies());
        super.setPepperoni(ingredientFactory.createPepperoni());
        super.setClams(ingredientFactory.createClam());
    }
}
