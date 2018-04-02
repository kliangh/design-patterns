package code.kliangh.behavioral.strategy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTest {
    private ShootingGuard shootingGuard;

    private Defender slowDefender;

    private Defender agileDefender;

    @Before
    public void setUp() {
        this.shootingGuard = new ShootingGuard("Flash", 9);
        this.slowDefender = new Defender("Shaq", 1);
        this.agileDefender = new Defender("Mamba", 10);
    }

    @Test
    public void decideOffensiveStrategy() {
        Score layup = shootingGuard.score(slowDefender);
        assertTrue(layup instanceof Layup);
        assertEquals(2, layup.score());

        Score threePointShot = shootingGuard.score(agileDefender);
        assertTrue(threePointShot instanceof ThreePointShot);
        assertEquals(3, threePointShot.score());
    }
}