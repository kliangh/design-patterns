package code.kliangh.creational.builder;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class SauceCook implements Cook {
    @Override
    public ProcessedIngredients processIngredients(List<String> ingredients) {
        return new Sauce(Cookery.STEW, ImmutableList.of("Mushroom", "Red Wine"));
    }
}
