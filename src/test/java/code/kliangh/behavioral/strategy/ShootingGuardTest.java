package code.kliangh.behavioral.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShootingGuardTest {
    private ShootingGuard shootingGuard;

    private static final String NAME = "Flash";

    private static final int SPEED = 9;

    @Before
    public void setUp() {
        this.shootingGuard = new ShootingGuard(NAME, SPEED);
    }

    @Test
    public void validatePlayerInfo() {
        assertEquals(NAME, shootingGuard.getName());
        assertTrue(SPEED == shootingGuard.getSpeed());
    }
}
