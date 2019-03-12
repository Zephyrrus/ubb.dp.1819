package ro.ubb.zephy.lab01.domain;

import java.util.List;
import java.util.stream.Collectors;

public class UnidentifiedCoffee extends BaseCoffee {
    public UnidentifiedCoffee(List<Ingredient> ingredientList) {
        super(ingredientList);
    }

    @Override
    public String toString() {
        return "UnidentifiedCoffee{ingredients=[" +
                ingredients.stream().map(Object::toString).collect(Collectors.joining(" "))
                + "]}";
    }
}
