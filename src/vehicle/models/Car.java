package vehicle.models;

public class Car extends Vehicle {
    private int numberSeat;
    private String vehicleType;

    public Car() {
    }

    public Car(String licensePlates, String automakers, int yearOfManufacture, String ownerCar, int numberSeat, String vehicleType) {
        super(licensePlates, automakers, yearOfManufacture, ownerCar);
        this.numberSeat = numberSeat;
        this.vehicleType = vehicleType;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberSeat=" + numberSeat +
                ", vehicleType='" + vehicleType + '\'' +
                "} " + super.toString();
    }
}
