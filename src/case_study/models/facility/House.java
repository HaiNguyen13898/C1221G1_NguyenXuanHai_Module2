package case_study.models.facility;

public class House extends Facility {
    private String standardRoom;
    private int numberFloor;


    public House() {
    }

    public House(String standardRoom, int numberFloor) {
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public House(String id, String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String standardRoom, int numberFloor) {
        super(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House {" + super.toString() +
                ", standardRoom='" + standardRoom + '\'' +
                ", numberFloor=" + numberFloor +
                " }";
    }

    public String writeFileHouse() {
        return this.getId() + "," + this.getNameService() + "," + this.getUsableArea() + "," + this.getRentalCosts() +
                "," + this.getMaximumPeople() + "," + this.getRentalType() +
                "," + this.getStandardRoom() + "," + this.getNumberFloor();
    }
}
