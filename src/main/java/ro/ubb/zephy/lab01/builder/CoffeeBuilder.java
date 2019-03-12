package ro.ubb.zephy.lab01.builder;

import ro.ubb.zephy.lab01.domain.BaseCoffee;
import ro.ubb.zephy.lab01.domain.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    List<Ingredient> ingredients = new ArrayList<>();

    public CoffeeBuilder addIngredient(Ingredient i)
    {
        ingredients.add(i);
        return this;
    }

    public BaseCoffee build()
    {
        BaseCoffee coffee = new BaseCoffee(ingredients);
        return coffee;
    }
}
