package code.kliangh.creational.builder;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RoastCookTest {
    private RoastCook roastCook;

    @Before
    public void setUp() {
        roastCook = new RoastCook();
    }

    @Test
    public void processIngredients() {
        List<String> ingredients = ImmutableList.of("Fish");
        ProcessedIngredients roastedIngredients =
                roastCook.processIngredients(ingredients);

        Assert.assertEquals(Cookery.ROAST, roastedIngredients.getCookery());
    }
}