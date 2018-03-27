package code.kliangh.creational.prototype;

public abstract class SuzukiSportBike implements Cloneable {
    private Engine engine;

    private Integer displacement;

    private Integer transmission;

    protected FrontFork frontFork;

    protected boolean quickShiftSystem;

    public SuzukiSportBike() {
        this.engine = Engine.FOUR_CYLINDER;
        this.frontFork = FrontFork.SHOWA_BPF;
        this.quickShiftSystem = false;
        this.displacement = 999;
        this.transmission = 6;
    }

    public SuzukiSportBike clone() throws CloneNotSupportedException {

        return (SuzukiSportBike) super.clone();
    }

    public Engine getEngine() {
        return engine;
    }

    public FrontFork getFrontFork() {
        return frontFork;
    }

    public boolean hasQuickShiftSystem() {
        return quickShiftSystem;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public Integer getTransmission() {
        return transmission;
    }
}
