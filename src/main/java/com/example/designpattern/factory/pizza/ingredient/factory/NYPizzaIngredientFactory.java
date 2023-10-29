package com.example.designpattern.factory.pizza.ingredient.factory;

import com.example.designpattern.factory.pizza.ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("create Thin Crust Dough ...");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("create MarinaraSauce ...");
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("create Reggiano Cheese ...");
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] creaeVeggies() {
        Veggies[] veggies = { new Galic(), new Onion(), new Mushroom(), new RedPepper() };
        System.out.println("create Veggies : Galic, Onion, Mushroom, RedPepper ...");
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("create SlicePepperoni ...");
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        System.out.println("create Fresh Clams ...");
        return new FreshClams();
    }
}
