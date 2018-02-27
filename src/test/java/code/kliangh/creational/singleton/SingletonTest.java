package code.kliangh.creational.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    private Singleton instance1 = null;
    private Singleton instance2 = null;

    @BeforeEach
    void setUp() {
        instance1 = Singleton.getInstance();
        instance2 = Singleton.getInstance();
    }

    @Test
    void checkInstance() {
        assertEquals(instance1, instance1);
    }
}