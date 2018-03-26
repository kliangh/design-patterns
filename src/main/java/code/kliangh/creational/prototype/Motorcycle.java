package code.kliangh.creational.prototype;

public abstract class Motorcycle implements Cloneable {
    private Engine engine;

    private FrontFork frontFork;

    private boolean quickShiftSystem;

    private Integer displacement;

    private Integer transmission;

    public Motorcycle() {
        this.engine = Engine.FOUR_CYLINDER;
        this.frontFork = FrontFork.SHOWA_BPF;
        this.quickShiftSystem = false;
        this.displacement = 999;
        this.transmission = 6;
    }

    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
