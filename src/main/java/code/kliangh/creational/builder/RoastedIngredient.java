package code.kliangh.creational.builder;

import org.apache.commons.lang3.StringUtils;

public class RoastedIngredient extends ProcessedIngredients {

    RoastedIngredient(String ingredient) {
        setCookery(Cookery.ROAST);
        setProcessedIngredientsName(StringUtils.join(
                Cookery.ROAST.getPrefix(),
                " ",
                ingredient));
    }
}
