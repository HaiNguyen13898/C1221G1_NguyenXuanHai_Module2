package case_study.services.facility_service;

import case_study.models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaServicesImpl implements FacilityService {

    private static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);


    static {
        villaIntegerMap.put(new Villa("1", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("2", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("3", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("4", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
    }

    @Override
    public void add() {
        System.out.print("Nhập mã dịch vụ: ");
        String  id = scanner.nextLine();
        System.out.print("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
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
        String standardVilla = scanner.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        double swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        Villa villas = new Villa(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardVilla, swimmingPoolArea, numberFloor);
        villaIntegerMap.put(villas, 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Villa, Integer> villaEntry : villaIntegerMap.entrySet()) {
            System.out.println(villaEntry.getKey() + " " + villaEntry.getValue());
        }
    }

    public void villaMaintenance() {
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
