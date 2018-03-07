package code.kliangh.creational.factory;

public class Sedan implements Vehicle {
    private String owner;

    Sedan(String owner) {
        this.owner = owner;
    }

    @Override
    public String showOwnerIdentity() {
        return this.owner;
    }
}
