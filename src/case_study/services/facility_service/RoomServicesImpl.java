package case_study.services.facility_service;

import case_study.models.facility.Room;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomServicesImpl implements FacilityService {
    private static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    static {
        roomIntegerMap.put(new Room("1", "ckd", "35", "70000", "2", "ngày", "dọn phòng"), 0);
        roomIntegerMap.put(new Room("2", "tert", "35", "70000", "2", "ngày", "dọn phòng"), 0);
        roomIntegerMap.put(new Room("3", "opo", "35", "70000", "2", "ngày", "dọn phòng"), 0);
        roomIntegerMap.put(new Room("4", "mnm", "35", "70000", "2", "ngày", "dọn phòng"), 0);
    }


    @Override
    public void add() {
        System.out.print("Nhập mã dịch vụ: ");
        String id = scanner.nextLine();
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
        System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
        String freeServ = scanner.nextLine();
        Room rooms = new Room(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, freeServ);
        roomIntegerMap.put(rooms, 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Room, Integer> roomEntry : roomIntegerMap.entrySet()) {
            System.out.println(roomEntry.getKey() + " " + roomEntry.getValue());
        }
    }

    public void roomMaintenance() {
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
