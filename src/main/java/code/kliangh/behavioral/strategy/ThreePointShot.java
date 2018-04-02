package code.kliangh.behavioral.strategy;

/**
 * Strategy implementation
 */
public class ThreePointShot implements Score {
    @Override
    public int score() {
        return 3;
    }
}
