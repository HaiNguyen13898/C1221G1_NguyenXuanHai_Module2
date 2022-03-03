package vehicle;

public  class  Vehicle {
    private  String licensePlates;
    private  String automakers;
    private  int yearOfManufacture;
    private  String ownerCar;

    public Vehicle() {
    }

    public Vehicle(String licensePlates, String automakers, int yearOfManufacture, String ownerCar) {
        this.licensePlates = licensePlates;
        this.automakers = automakers;
        this.yearOfManufacture = yearOfManufacture;
        this.ownerCar = ownerCar;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getAutomakers() {
        return automakers;
    }

    public void setAutomakers(String automakers) {
        this.automakers = automakers;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwnerCar() {
        return ownerCar;
    }

    public void setOwnerCar(String ownerCar) {
        this.ownerCar = ownerCar;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", automakers='" + automakers + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", ownerCar='" + ownerCar + '\'' +
                '}';
    }
}
