package code.kliangh.creational.factory;

public class Coupe implements Vehicle {
    private String owner;

    Coupe(java.lang.String owner) {
        this.owner = owner;
    }

    @Override
    public String showOwnerIdentity() {
        return this.owner;
    }
}
