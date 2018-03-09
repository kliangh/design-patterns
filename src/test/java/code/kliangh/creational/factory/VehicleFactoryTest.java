package code.kliangh.creational.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehicleFactoryTest {
    private VehicleFactory vehicleFactory;

    @Before
    public void setUp() {
        vehicleFactory = new VehicleFactory();
    }

    @Test
    public void tryToBuildACoupe() {
        String owner = "John";
        Vehicle coupe = vehicleFactory.buildVehicle(owner, VehicleType.COUPE);

        Assert.assertTrue(coupe instanceof Coupe);
        Assert.assertEquals(owner, coupe.showOwnerIdentity());
    }

    @Test
    public void tryToBuildASedan() {
        String owner = "Doe";
        Vehicle sedan = vehicleFactory.buildVehicle(owner, VehicleType.SEDAN);

        Assert.assertTrue(sedan instanceof Sedan);
        Assert.assertEquals(owner, sedan.showOwnerIdentity());
    }

    @Test
    public void tryToBuildAWagon() {
        String owner = "Foo";
        Vehicle wagon = vehicleFactory.buildVehicle(owner, VehicleType.WAGON);

        Assert.assertTrue(wagon instanceof Wagon);
        Assert.assertEquals(owner, wagon.showOwnerIdentity());
    }

    @Test
    public void tryToBuildALorry() {
        String owner = "nobody";
        Vehicle lorry = vehicleFactory.buildVehicle(owner, VehicleType.LORRY);

        Assert.assertNull(lorry);
    }

}