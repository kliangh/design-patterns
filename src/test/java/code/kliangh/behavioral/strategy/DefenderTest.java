package code.kliangh.behavioral.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefenderTest {
    private Defender defender;

    private static final String NAME = "Shaq";

    private static final int SPEED = 1;

    @Before
    public void setUp() {
        this.defender = new Defender(NAME, SPEED);
    }

    @Test
    public void validatePlayerInfo() {
        assertEquals(NAME, defender.getName());
        assertTrue(SPEED == defender.getSpeed());
    }

}
