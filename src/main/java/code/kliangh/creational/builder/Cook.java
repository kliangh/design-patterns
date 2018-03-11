package code.kliangh.creational.builder;

import java.util.List;

/* Builder */
public interface Cook {
    ProcessedIngredients processIngredients(List<String> ingredients);
}
