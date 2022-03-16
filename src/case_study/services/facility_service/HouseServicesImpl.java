package case_study.services.facility_service;

import case_study.models.facility.House;
import case_study.utils.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseServicesImpl implements FacilityService {

    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();

    static {
        houseIntegerMap.put(new House("1", "ada", "43.3", "3230", "4", "tháng", "phòng đôi", 1), 0);
        houseIntegerMap.put(new House("2", "eqw", "43.3", "3230", "4", "tháng", "phòng đôi", 1), 0);
        houseIntegerMap.put(new House("3", "xcv", "43.3", "3230", "4", "tháng", "phòng đôi", 1), 0);
    }

    @Override
    public void add() {
        String id;
        do {
            System.out.print("Nhập mã dịch vụ: ");
            id = scanner.nextLine();
        } while (!regex.regexId(id));

        String nameService;
        do {
            System.out.print("Nhập tên dịch vụ: ");
            nameService = scanner.nextLine();
        } while (!regex.regexNameService(nameService));

        String usableArea;
        do {
            System.out.print("Nhập diện tích sử dụng: ");
            usableArea = scanner.nextLine();
        } while (!regex.regexArea(usableArea));

        String rentalCosts;
        do {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = scanner.nextLine();
        } while (!regex.regexInteger(rentalCosts));

        String maximumPeople;
        do {
            System.out.print("Nhập số lượng người ở tối đa: ");
            maximumPeople = scanner.nextLine();
        } while (!regex.regexInteger(maximumPeople));

        String rentalType;
        do {
            System.out.print("kiểu thuê: \n" +
                    "Năm\n" +
                    "Tháng\n" +
                    "Ngày\n" +
                    "Giờ\n" +
                    "Nhập kiểu thuê: ");
            rentalType = scanner.nextLine();
        } while (!regex.regexNameService(rentalCosts));

        String standardRoom;
        do {
            System.out.print("Nhập tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
        }while (!regex.regexNameService(standardRoom));


        System.out.print("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House houses = new House(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, numberFloor);
        houseIntegerMap.put(houses, 0);

    }

    @Override
    public void display() {
        for (Map.Entry<House, Integer> houseEntry : houseIntegerMap.entrySet()) {
            System.out.println(houseEntry.getKey() + " " + houseEntry.getValue());
        }
    }


    public void houseMaintenance() {
    }

    @Override
    public void edit() {
    }

    @Override
    public void delete() {
    }
}
