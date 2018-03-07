package code.kliangh.creational.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {
    private Singleton firstInstance;
    private Singleton secondInstance;

    @Before
    public void setUp() {
        firstInstance = Singleton.getInstance();
        secondInstance = Singleton.getInstance();
    }

    @Test
    public void checkInstance() {
        Assert.assertEquals(firstInstance, secondInstance);
    }

}