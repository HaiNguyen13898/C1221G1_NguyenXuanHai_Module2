package case_study.services.facility_service;

import case_study.models.facility.House;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseServicesImpl implements FacilityService {

    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);


    static {
        houseIntegerMap.put(new House("1", "ada", 43, 30000, 4, "tháng", "phòng đôi", 1), 0);
        houseIntegerMap.put(new House("2", "eqw", 54, 5343, 4, "tháng", "phòng đôi", 1), 0);
        houseIntegerMap.put(new House("3", "xcv", 98, 32445, 4, "tháng", "phòng đôi", 1), 0);
    }

    @Override
    public void add() {
        System.out.print("Nhập mã dịch vụ: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên dịch vụ: ");
        String  nameService = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double  usableArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng người ở tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.print("kiểu thuê: \n" +
                "Năm\n" +
                "Tháng\n" +
                "Ngày\n" +
                "Giờ\n" +
                "Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String  standardRoom = scanner.nextLine();
        System.out.print("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House houses = new House(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, numberFloor);
        houseIntegerMap.put(houses, 3);

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
