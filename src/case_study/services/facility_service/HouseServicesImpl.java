package case_study.services.facility_service;

import case_study.models.facility.House;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HouseServicesImpl implements FacilityService {
    public static List<House> houseList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        houseList.add(new House("abc", 45.4, 30000, 4, "tháng", "phòng đôi", 1));
        houseList.add(new House("adc", 45.4, 30000, 4, "tháng", "phòng đôi", 1));
        houseList.add(new House("clc", 45.4, 30000, 4, "tháng", "phòng đôi", 1));
        houseList.add(new House("kmg", 45.4, 30000, 4, "tháng", "phòng đôi", 1));

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
        String standardRoom = scanner.nextLine();
        System.out.print("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House houses = new House(nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, numberFloor);
        houseList.add(houses);
    }

    @Override
    public void display() {
        for (House h : houseList) {
            System.out.println(h);
        }
    }

    @Override
    public void edit() {
//        display();
//        System.out.print("Nhập tên dịch vụ House cần thay đổi: ");
//        String name = scanner.nextLine();
//        int choose;
//        for (int i = 0; i < houseList.size(); i++) {
//            if (houseList.get(i).getNameService().toLowerCase().contains(name)) {
//                System.out.print("===Change information===\n" +
//                        "1.Name service\n" +
//                        "2.Usable Area\n" +
//                        "3.Rental Costs\n" +
//                        "4.Maximum people\n" +
//                        "5.Rental Type\n" +
//                        "6.Standard room\n" +
//                        "7.Number floor\n" +
//                        "Enter your choice: ");
//                choose = Integer.parseInt(scanner.nextLine());
//                switch (choose) {
//                    case 1:
//                        System.out.print("Sửa tên dịch vụ: ");
//                        String nameService = scanner.nextLine();
//                        houseList.get(i).setNameService(nameService);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                    case 2:
//                        System.out.print("Sửa diện tích sử dụng: ");
//                        double usableArea = Double.parseDouble(scanner.nextLine());
//                        houseList.get(i).setUsableArea(usableArea);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                    case 3:
//                        System.out.print("Sửa giá thuê: ");
//                        int rentalCost = Integer.parseInt(scanner.nextLine());
//                        houseList.get(i).setRentalCosts(rentalCost);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                    case 4:
//                        System.out.print("Sửa số lượng người tối đa có thể ở: ");
//                        int maximumPeople = Integer.parseInt(scanner.nextLine());
//                        houseList.get(i).setMaximumPeople(maximumPeople);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                    case 5:
//                        System.out.print("Sửa kiểu thuê:\n" +
//                                "Năm\n" +
//                                "Tháng\n" +
//                                "Ngày\n" +
//                                "Giờ\n" +
//                                "Nhập sửa: ");
//                        String rentalType = scanner.nextLine();
//                        houseList.get(i).setRentalType(rentalType);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                    case 6:
//                        System.out.print("Sửa tiêu chuẩn phòng: ");
//                        String standardRoom = scanner.nextLine();
//                        houseList.get(i).setStandardRoom(standardRoom);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                    case 7:
//                        System.out.print("Sửa số tầng: ");
//                        int numberFloor = Integer.parseInt(scanner.nextLine());
//                        houseList.get(i).setNumberFloor(numberFloor);
//                        System.out.println("Đã sửa thành công!!!");
//                        display();
//                        break;
//                }
//
//            }
//        }
    }

    @Override
    public void delete() {
    }
}
