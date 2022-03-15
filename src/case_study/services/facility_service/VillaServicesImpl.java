package case_study.services.facility_service;

import case_study.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServicesImpl implements FacilityService {
    static List<Villa> villaList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static {
        villaList.add(new Villa("rty", 78.6, 8000, 7, "tháng", "deluxe", 60.3, 2));
        villaList.add(new Villa("uyy", 78.6, 8000, 7, "tháng", "deluxe", 60.3, 2));
        villaList.add(new Villa("oui", 78.6, 8000, 7, "tháng", "deluxe", 60.3, 2));
        villaList.add(new Villa("quwe", 78.6, 8000, 7, "tháng", "deluxe", 60.3, 2));
    }
    @Override
    public void add() {
        System.out.print("Nhập tên dịch vụ: ");
        String nameService = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
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
        Villa villas = new Villa(nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardVilla, swimmingPoolArea, numberFloor);
        villaList.add(villas);
    }

    @Override
    public void display() {
        for (Villa v: villaList) {
            System.out.println(v);
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
