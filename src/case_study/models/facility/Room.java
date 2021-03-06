package case_study.models.facility;

public class Room extends Facility {


    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameService, double usableArea, double rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }



    @Override
    public String toString() {
        return "Room {" + super.toString() +
                ", freeService='" + freeService + '\'' +
                " }" ;
    }
}
