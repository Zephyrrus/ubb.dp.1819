package ro.ubb.zephy.lab01.factory;

import ro.ubb.zephy.lab01.domain.BaseCoffee;
import ro.ubb.zephy.lab01.domain.Ingredient;

import java.util.List;

public interface ICoffeeFactory {
    BaseCoffee buildCoffee(List<Ingredient> ingredientList);
}
