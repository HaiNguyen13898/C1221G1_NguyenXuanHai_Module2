package case_study.models.facility;

public class Villa extends Facility {
    private String standardRoom;
    private double swimmingPoolArea;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String standardRoom, double swimmingPoolArea, int numberFloor) {
        this.standardRoom = standardRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String id, String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String standardRoom, double swimmingPoolArea, int numberFloor) {
        super(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }



    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                ", standardRoom='" + standardRoom + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberFloor=" + numberFloor +
                " }" ;
    }
}
