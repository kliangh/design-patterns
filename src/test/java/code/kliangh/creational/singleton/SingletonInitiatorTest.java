package code.kliangh.creational.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonInitiatorTest {
    private Singleton instanceGeneratedByInitiator;

    @Before
    public void setUp() {
        new SingletonInitiator();
        instanceGeneratedByInitiator = Singleton.getInstance();
    }

    @Test
    public void validInstanceGeneratedByInitiator() {
        Assert.assertEquals(Singleton.getInstance(), instanceGeneratedByInitiator);
    }
}