package com.example.designpattern.factory.pizza.ingredient.factory;

import com.example.designpattern.factory.pizza.ingredient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] creaeVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
