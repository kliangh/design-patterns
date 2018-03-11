package code.kliangh.creational.builder;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class ChefTest {
    private Chef chef;
    private static final String MAIN_DISH_NAME = "Roasted Beef with Mushroom Red Wine Sauce";

    @Before
    public void setUP() {
        chef = new Chef();
    }

    @Test
    public void serveMainDish() {
        Map<String, Cook> cooks =ImmutableMap.of(
                "SauceCook", new SauceCook(),
                "RoastCook", new RoastCook());

        chef.setCooks(cooks);
        Dish mainDish = chef.serveDish();

        Assert.assertEquals(mainDish.getDishType(), DishType.MAIN);
        Assert.assertEquals(MAIN_DISH_NAME, mainDish.getDishName());
    }
}
