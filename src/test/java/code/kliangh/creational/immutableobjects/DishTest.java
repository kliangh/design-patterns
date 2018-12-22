package code.kliangh.creational.immutableobjects;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DishTest {

    private Dish dish;

    @Before
    public void setUp() {
        this.dish = new Dish("Soup", DishType.APPETISER, Arrays.asList("Enjoy it!!"));
    }

    @Test
    public void getDishName() {
        Assert.assertEquals("Soup", dish.getDishName());
    }

    @Test
    public void getDishType() {
        Assert.assertEquals(DishType.APPETISER, dish.getDishType());
    }

    @Test
    public void getSteps() {
        Assert.assertEquals(ImmutableList.of("Enjoy it!!"), dish.getNotes());
    }
}