package ro.ubb.zephy.lab01.factory;

import ro.ubb.zephy.lab01.domain.*;

import java.util.List;

public class CoffeeFactory implements ICoffeeFactory {

    @Override
    public BaseCoffee buildCoffee(List<Ingredient> ingredientList) {
        if (ingredientList == null || ingredientList.size() == 0)
            return new AirCoffee();
        else if (ingredientList.equals(Cappuccino.getBaseIngredients()))
            return new Cappuccino();
        else
            return new UnidentifiedCoffee(ingredientList);
    }
}
