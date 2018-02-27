package code.kliangh.creational.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    private Singleton firstInstance;
    private Singleton secondInstance;

    @BeforeEach
    void setUp() {
        firstInstance = Singleton.getInstance();
        secondInstance = Singleton.getInstance();
    }

    @Test
    void checkInstance() {
        assertEquals(firstInstance, secondInstance);
    }
}