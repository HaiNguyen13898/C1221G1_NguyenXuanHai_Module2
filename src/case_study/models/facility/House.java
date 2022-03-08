package case_study.models.facility;

public class House extends Villa {
    public House() {
    }

    public House(String nameService, double usableArea, int rentalCosts, int maximumPeople, String rentalType, String standardRoom, double swimmingPoolArea, int numberFloor) {
        super(nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, swimmingPoolArea, numberFloor);
    }
}
