package ro.ubb.zephy.lab01.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ro.ubb.zephy.lab01.domain.CommonIngredients.twoCupsWater;
import static ro.ubb.zephy.lab01.domain.CommonIngredients.quarterCupBeansRoasted;
import static ro.ubb.zephy.lab01.domain.CommonIngredients.hundredMLMilkFoamed;


public class Cappuccino extends BaseCoffee {
    private static List<Ingredient> baseIngredients = Arrays.asList(twoCupsWater, quarterCupBeansRoasted, hundredMLMilkFoamed);
    // Cappuccino: 2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk
    public Cappuccino() {
        super(baseIngredients);
    }

    public static List<Ingredient> getBaseIngredients() {
        return baseIngredients;
    }

    @Override
    public String toString() {
        return "Cappucino{ingredients=[" +
                ingredients.stream().map(Object::toString).collect(Collectors.joining(" "))
                + "]}";
    }
}

