package code.kliangh.creational.builder;

import java.util.List;

public class RoastCook implements Cook {
    @Override
    public ProcessedIngredients processIngredients(List<String> ingredients) {
        return new RoastedIngredient(ingredients.get(0));
    }
}
