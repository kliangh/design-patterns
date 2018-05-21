package code.kliangh.creational.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class VehicleFactoryTest {
    private VehicleFactory vehicleFactory;

    @Before
    public void setUp() {
        vehicleFactory = new VehicleFactory();
    }

    @Test
    public void tryToBuildACoupe() {
        String owner = "John";
        Optional<Vehicle> coupe = vehicleFactory.buildVehicle(owner, VehicleType.COUPE);

        Assert.assertTrue(coupe.get() instanceof Coupe);
        Assert.assertEquals(owner, coupe.get().showOwnerIdentity());
    }

    @Test
    public void tryToBuildASedan() {
        String owner = "Doe";
        Optional<Vehicle> sedan = vehicleFactory.buildVehicle(owner, VehicleType.SEDAN);

        Assert.assertTrue(sedan.get() instanceof Sedan);
        Assert.assertEquals(owner, sedan.get().showOwnerIdentity());
    }

    @Test
    public void tryToBuildAWagon() {
        String owner = "Foo";
        Optional<Vehicle> wagon = vehicleFactory.buildVehicle(owner, VehicleType.WAGON);

        Assert.assertTrue(wagon.get() instanceof Wagon);
        Assert.assertEquals(owner, wagon.get().showOwnerIdentity());
    }

}