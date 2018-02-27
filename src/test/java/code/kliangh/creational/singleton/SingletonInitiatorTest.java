package code.kliangh.creational.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonInitiatorTest {
    private Singleton instanceGeneratedByInitiator;

    @BeforeEach
    void setUp() {
        new SingletonInitiator();
        instanceGeneratedByInitiator = Singleton.getInstance();
    }

    @Test
    void validInstanceGeneratedByInitiator() {
        assertEquals(Singleton.getInstance(), instanceGeneratedByInitiator);
    }
}