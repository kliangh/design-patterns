package code.kliangh.creational.builder;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Sauce extends ProcessedIngredients{
    private static final String POSTFIX = " Sauce";

    Sauce(Cookery cookery, List<String> ingredients) {
        setCookery(cookery);
        setProcessedIngredientsName(StringUtils.join(ingredients, " ") + POSTFIX);
    }
}
