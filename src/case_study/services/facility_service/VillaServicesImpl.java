package case_study.services.facility_service;

import case_study.models.facility.Villa;
import case_study.utils.Regex;

import java.util.*;

public class VillaServicesImpl implements FacilityService {

    private static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();

    static {
        villaIntegerMap.put(new Villa("1", "rty", "78.6", "8000", "7", "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("2", "qwe", "78.6", "8000", "7", "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("3", "xcv", "78.6", "8000", "7", "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("3", "ZXc", "78.6", "8000", "7", "tháng", "deluxe", 60.3, 2), 0);
    }

    @Override
    public void add() {
        String id;
        do {
            System.out.print("Nhập mã dịch vụ: ");
            id = scanner.nextLine();
        } while (!regex.regexId(id));

        System.out.print("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        String usableArea = scanner.nextLine();
        System.out.print("Nhập chi phí thuê: ");
        String rentalCosts = scanner.nextLine();
        System.out.print("Nhập số lượng người ở tối đa: ");
        String maximumPeople = scanner.nextLine();
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
