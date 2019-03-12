package ro.ubb.zephy.lab01;

import ro.ubb.zephy.lab01.builder.CoffeeBuilder;
import ro.ubb.zephy.lab01.domain.BaseCoffee;
import ro.ubb.zephy.lab01.domain.Ingredient;
import ro.ubb.zephy.lab01.factory.CoffeeFactory;
import ro.ubb.zephy.lab01.service.IngredientParserService;
import ro.ubb.zephy.lab01.service.ReaderService;

import java.util.Arrays;
import java.util.List;

import static ro.ubb.zephy.lab01.domain.CommonIngredients.*;

public class Lab01 {
    public static void main(String[] args) {
        IngredientParserService parserService = new IngredientParserService();
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();

        System.out.println("Lines in file: ");
        List<String> ingredientStrings = ReaderService.readAllLines("coffee.txt");
        for (String ingredientString : ingredientStrings)
            System.out.println(ingredientString);

        System.out.println("------------------");
        System.out.println("Ingredients in file: ");
        List<Ingredient> ingredients = parserService.parseIngredients(ingredientStrings);
        for (Ingredient ingredient : ingredients)
            System.out.println(ingredient.toString());

        System.out.println("------------------");
        System.out.println("Factory Example");
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        BaseCoffee createdCoffee = coffeeFactory.buildCoffee(null);
        System.out.println(createdCoffee);

        BaseCoffee shouldBeACap = coffeeFactory.buildCoffee(Arrays.asList(twoCupsWater, quarterCupBeansRoasted, hundredMLMilkFoamed));
        System.out.println(shouldBeACap);

        System.out.println(coffeeBuilder.addIngredient(twoCupsWater).addIngredient(quarterCupBeansRoasted).addIngredient(hundredMLMilkFoamed).build());
    }
}
