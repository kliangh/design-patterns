package code.kliangh.behavioral.strategy;

/**
 * Context
 */
public class GuardOffensiveStrategy {

    public Score decideOffensiveStrategy(int attackerSpeed, int defenderSpeed) {
        if (attackerSpeed > defenderSpeed) {
            return new Layup();
        }

        return new ThreePointShot();
    }
}
