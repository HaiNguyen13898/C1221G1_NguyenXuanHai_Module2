package vehicle.models;

public class Truck extends Vehicle {
    private double vehicleLoad;

    public Truck() {
    }



    public Truck(String licensePlates, String automakers, int yearOfManufacture, String ownerCar, double vehicleLoad) {
        super(licensePlates, automakers, yearOfManufacture, ownerCar);
        this.vehicleLoad = vehicleLoad;
    }

    public double getVehicleLoad() {
        return vehicleLoad;
    }

    public void setVehicleLoad(double vehicleLoad) {
        this.vehicleLoad = vehicleLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "vehicleLoad=" + vehicleLoad +
                "} " + super.toString();
    }
}
