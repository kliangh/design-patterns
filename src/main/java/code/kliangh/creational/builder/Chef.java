package code.kliangh.creational.builder;

import com.google.common.collect.ImmutableList;
import lombok.Setter;

import java.util.Map;

/* Director */
public class Chef {
    @Setter
    private Map<String, Cook> cooks;

    public Dish serveDish() {
        Dish dish = new Dish();

        ProcessedIngredients sauce =
                cooks.get("SauceCook").processIngredients(ImmutableList.of("Mushroom", "Red Wine"));
        ProcessedIngredients roastedBeef =
                cooks.get("RoastCook").processIngredients(ImmutableList.of("Beef"));

        dish.setDishName(roastedBeef.getProcessedIngredientsName() + " with " + sauce.getProcessedIngredientsName());
        dish.setDishType(DishType.MAIN);

        return dish;
    }
}
