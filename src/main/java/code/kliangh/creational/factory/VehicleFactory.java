package code.kliangh.creational.factory;

import java.util.Optional;

public class VehicleFactory {

    public Optional<Vehicle> buildVehicle(String owner, VehicleType vehicleType) {
        return Optional.of(vehicleType.buildVehicle(owner));
    }
}
