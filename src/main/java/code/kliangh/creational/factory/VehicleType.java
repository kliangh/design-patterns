package code.kliangh.creational.factory;

public enum VehicleType {
    SEDAN {
        @Override
        Vehicle buildVehicle(String owner) {
            return new Sedan(owner);
        }
    }, COUPE {
        @Override
        Vehicle buildVehicle(String owner) {
            return new Coupe(owner);
        }
    }, WAGON {
        @Override
        Vehicle buildVehicle(String owner) {
            return new Wagon(owner);
        }
    };

    abstract Vehicle buildVehicle(String owner);
}
