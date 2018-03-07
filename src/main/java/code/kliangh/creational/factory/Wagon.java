package code.kliangh.creational.factory;

public class Wagon implements Vehicle {
    private String owner;

    Wagon(java.lang.String owner) {
        this.owner = owner;
    }

    @Override
    public String showOwnerIdentity() {
        return this.owner;
    }
}
