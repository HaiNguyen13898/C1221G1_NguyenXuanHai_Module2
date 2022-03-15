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

    public House(String nameService, double usableArea, int rentalCosts, int maximumPeople, String rentalType, String standardRoom, int numberFloor) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType);
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
                " }" ;
    }
}
