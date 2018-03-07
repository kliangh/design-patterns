package code.kliangh.creational.factory;

public class VehicleFactory {

    public Vehicle buildVehicle(java.lang.String owner, VehicleType vehicleType) {
        switch (vehicleType) {
            case Coupe:
                return new Coupe(owner);

            case Sedan:
                return new Sedan(owner);

            case Wagon:
                return new Wagon(owner);

            default:
                return null;
        }
    }
}
