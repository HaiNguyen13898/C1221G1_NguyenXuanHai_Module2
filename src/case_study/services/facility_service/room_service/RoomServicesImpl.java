package case_study.services.facility_service.room_service;

import case_study.models.facility.Room;
import case_study.services.facility_service.FacilityService;
import case_study.utils.Regex;

import java.util.*;

public class RoomServicesImpl implements FacilityService {
    private static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
    private static List<Room> roomList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();

    static {
        roomIntegerMap.put(new Room("1", "ckd", 35, 7000, 2, "ngày", "dọn phòng"), 0);
        roomIntegerMap.put(new Room("2", "ckd", 35, 7000, 2, "ngày", "dọn phòng"), 0);
        roomIntegerMap.put(new Room("3", "ckd", 35, 7000, 2, "ngày", "dọn phòng"), 0);
        roomIntegerMap.put(new Room("4", "ckd", 35, 7000, 2, "ngày", "dọn phòng"), 0);

    }

//    @Override
//    public void add() {
//        String id = inputId();
//        String nameService = inputNameService();
//        double usableArea = Double.parseDouble(inputArea());
//        double rentalCosts = Double.parseDouble(inputCost());
//        int maximumPeople = Integer.parseInt(inputPerson());
//        String rentalType = inputTypeRent() ;
//        System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
//        String freeServ = scanner.nextLine();
//        Room rooms = new Room(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, freeServ);
//        roomIntegerMap.put(rooms, 0);
//    }

    @Override
    public void add() {
        String id;
        do {
            System.out.println("Nhập mã dịch vụ: ");
            id = scanner.nextLine();
        }while (!regex.checkId(id + ""));

        String nameService;
        do {
            System.out.println("Nhập tên dịch vụ: ");
            nameService = scanner.nextLine();
        }while (!regex.checkName(nameService));

        double usableArea;
        do {
            System.out.println("Nhập diện tích sử dụng: ");
            usableArea = Double.parseDouble(scanner.nextLine());
        }while (!regex.checkArea(usableArea + ""));

        double rentalCosts;
        do {
            System.out.println("Nhập giá thuê: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        }while (!regex.checkCost(rentalCosts + ""));

        int maximumPeople;
        do {
            System.out.println("Nhập số người ở tối đa: ");
            maximumPeople = Integer.parseInt(scanner.nextLine());
        }while (!regex.checkPerson(maximumPeople + ""));

        String rentalType;
        do {
            System.out.println("Nhập kiểu thuê (giờ, ngày, tháng, năm: ");
            rentalType = scanner.nextLine();
        }while (!regex.checkName(rentalType));

        System.out.println("Nhập dịch vụ miễn phí: ");
        String freeService = scanner.nextLine();
        Room rooms = new Room(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, freeService);
        roomIntegerMap.put(rooms, 0);
        roomList.add(rooms);

    }


    @Override
    public void display() {
        for (Map.Entry<Room, Integer> roomEntry : roomIntegerMap.entrySet()) {
            System.out.println(roomEntry.getKey() + " " + roomEntry.getValue());
        }
    }
//    private String inputId (){
//        System.out.println("Nhập mã dịch vụ: ");
//        return regex.checkRegex(scanner.nextLine(), regex.REGEX_ID, "Mã dịch vụ theo định dạng là SVXX-YYYY!!" );
//    }
//    private String inputArea (){
//        System.out.println("Nhập diện tích sử dụng: ");
//        return regex.checkRegex(scanner.nextLine(), regex.REGEX_AREA, "Diện tích phải lớn hơn 30");
//    }
//    private String inputNameService (){
//        System.out.println("Nhập tên dịch vụ: ");
//        return regex.checkRegex(scanner.nextLine(), regex.REGEX_NAME, "Viết hoa chữ cái đầu và các chữ sau viết thườn");
//    }
//    private String inputCost (){
//        System.out.println("Nhập chi phí thuê: ");
//        return regex.checkRegex(scanner.nextLine(), regex.REGEX_INT, "Chi phí thuê phải lớn hơn 0");
//    }
//    private String inputPerson (){
//        System.out.println("Nhập số lượng người ở tối đa: ");
//        return regex.checkRegex(scanner.nextLine(), regex.REGEX_PERSON, "Số lượng người phải >0 và <20");
//    }
//    private String inputTypeRent (){
//        System.out.println("Nhập kiểu thuê: ");
//        return regex.checkRegex(scanner.nextLine(), regex.REGEX_NAME, "Kiểu thuê: năm, tháng, ngày, giờ");
//    }

    public void roomMaintenance() {
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
