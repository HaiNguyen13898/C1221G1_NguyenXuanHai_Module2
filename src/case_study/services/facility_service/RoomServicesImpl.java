package case_study.services.facility_service;

import case_study.models.facility.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServicesImpl implements FacilityService {
    static List<Room> roomList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        roomList.add(new Room("ckd", 35, 70000,2,"ngày", "dọn phòng" ));
        roomList.add(new Room("add", 35, 70000,2,"ngày", "dọn phòng" ));
        roomList.add(new Room("ggd", 35, 70000,2,"ngày", "dọn phòng" ));
        roomList.add(new Room("lfg", 35, 70000,2,"ngày", "dọn phòng" ));
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
        System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
        String freeServ = scanner.nextLine();
        Room rooms = new Room(nameService, usableArea, rentalCosts, maximumPeople, rentalType, freeServ);
        roomList.add(rooms);
    }

    @Override
    public void display() {
        for (Room r : roomList) {
            System.out.println(r);
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
