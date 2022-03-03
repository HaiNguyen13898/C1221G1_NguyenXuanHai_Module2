package vehicle;

public class Motorbike extends  Vehicle {
    private int power;


    public Motorbike() {
    }

    public Motorbike(String licensePlates, String automakers, int yearOfManufacture, String ownerCar, int power) {
        super(licensePlates, automakers, yearOfManufacture, ownerCar);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
