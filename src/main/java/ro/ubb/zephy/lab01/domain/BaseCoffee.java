package ro.ubb.zephy.lab01.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseCoffee implements IDrinkable {
    protected List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public BaseCoffee(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public BaseCoffee() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return "Coffee{ingredients=[" +
                ingredients.stream().map(Object::toString).collect(Collectors.joining(" "))
                + "]}";
    }
}
