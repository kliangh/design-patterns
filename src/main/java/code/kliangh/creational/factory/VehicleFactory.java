package code.kliangh.creational.factory;

public class VehicleFactory {

    public Vehicle buildVehicle(java.lang.String owner, VehicleType vehicleType) {
        switch (vehicleType) {
            case COUPE:
                return new Coupe(owner);

            case SEDAN:
                return new Sedan(owner);

            case WAGON:
                return new Wagon(owner);

            default:
                return null;
        }
    }
}
