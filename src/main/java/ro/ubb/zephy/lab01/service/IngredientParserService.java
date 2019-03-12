package ro.ubb.zephy.lab01.service;

import ro.ubb.zephy.lab01.domain.Ingredient;
import ro.ubb.zephy.lab01.exceptions.CoffeeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IngredientParserService {
    public List<Ingredient> parseIngredients(List<String> ingredientStrings) {
        List<Ingredient> ingredients = new ArrayList<>();

        for (String ingredientString : ingredientStrings) {
            List<String> components = Arrays.asList(ingredientString.split(" "));

            if (components.size() < 3 || components.size() > 4)
                throw new CoffeeException("Invalid amount of tokens provided for ingredient `" + ingredientString + "`. Parsing failed.");

            Float quantity;
            try {
                quantity = Float.parseFloat(components.get(0));
            } catch (NumberFormatException n) {
                throw new CoffeeException("Invalid quantity provided for ingredient `" + ingredientString + "`");
            }

            String unit = components.get(1);
            String name = components.get(2);

            if (components.size() == 3)
                ingredients.add(new Ingredient(quantity, unit, name));
            else if (components.size() == 4){
                String adjective = components.get(3);
                ingredients.add(new Ingredient(quantity, unit, name, adjective));
            }
        }
        return ingredients;
    }
}

