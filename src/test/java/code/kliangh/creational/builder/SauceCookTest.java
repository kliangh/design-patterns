package code.kliangh.creational.builder;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SauceCookTest {
    private SauceCook sauceCook;

    @Before
    public void setUp() {
        sauceCook = new SauceCook();
    }

    @Test
    public void processIngredients() {
        List<String> ingredients = ImmutableList.of("Mushroom", "Red Wine");

        ProcessedIngredients sauce = sauceCook.processIngredients(ingredients);

        Assert.assertEquals(Cookery.STEW, sauce.getCookery());
    }
}