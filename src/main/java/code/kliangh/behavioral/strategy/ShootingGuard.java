package code.kliangh.behavioral.strategy;

/**
 * Client
 */
public class ShootingGuard {
    private String name;

    private Integer speed;

    private GuardOffensiveStrategy guardOffensiveStrategy;

    public ShootingGuard(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
        this.guardOffensiveStrategy = new GuardOffensiveStrategy();
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Score score(Defender defender) {
        return guardOffensiveStrategy.decideOffensiveStrategy(this.speed, defender.getSpeed());
    }
}
