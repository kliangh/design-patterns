package code.kliangh.creational.builder;

import code.kliangh.creational.immutableobjects.Dish;
import code.kliangh.creational.immutableobjects.DishType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ChefTest {
    private static final String MAIN_DISH_NAME = "Roast beef with red wind sauce";

    @Test
    public void serveMainDish() {

        Dish mainDish =
                new Chef().setDishName(MAIN_DISH_NAME)
                          .setDishType(DishType.MAIN)
                          .setNotes(Arrays.asList("Slice beef into pieces.",
                                                  "Eat with red wine sauce."))
                          .serveDish();

        Assert.assertEquals(mainDish.getDishType(), DishType.MAIN);
        Assert.assertEquals(MAIN_DISH_NAME, mainDish.getDishName());
        Assert.assertEquals("Slice beef into pieces.", mainDish.getNotes().get(0));
        Assert.assertEquals("Eat with red wine sauce.", mainDish.getNotes().get(1));
    }
}
