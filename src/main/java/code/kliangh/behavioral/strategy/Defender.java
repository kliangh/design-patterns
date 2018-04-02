package code.kliangh.behavioral.strategy;

public class Defender {
    private String name;

    private Integer speed;

    public Defender(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }
}
