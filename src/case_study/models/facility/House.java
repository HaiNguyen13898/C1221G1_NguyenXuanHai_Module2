package case_study.models.facility;

public class House extends Villa {
    private String standardRoom;
    private int numberFloor;

    public House() {
    }

    public House(String standardRoom, int numberFloor) {
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public House(String nameService, double usableArea, int rentalCosts, int maximumPeople, String rentalType, String standardRoom, double swimmingPoolArea, int numberFloor, String standardRoom1, int numberFloor1) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, swimmingPoolArea, numberFloor);
        this.standardRoom = standardRoom1;
        this.numberFloor = numberFloor1;
    }

    @Override
    public String getStandardRoom() {
        return standardRoom;
    }

    @Override
    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    @Override
    public int getNumberFloor() {
        return numberFloor;
    }

    @Override
    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", numberFloor=" + numberFloor +
                "} " + super.toString();
    }
}
