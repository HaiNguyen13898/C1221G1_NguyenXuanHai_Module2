package vehicle;

public class Truck extends Vehicle implements FunctionTruck {
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
    public void addTruck() {

    }

    @Override
    public void displayTruck() {

    }

    @Override
    public void removeTruck() {

    }
}
