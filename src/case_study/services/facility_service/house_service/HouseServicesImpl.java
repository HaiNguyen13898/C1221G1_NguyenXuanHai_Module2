package case_study.services.facility_service.house_service;

import case_study.models.facility.House;
import case_study.services.facility_service.FacilityService;
import case_study.utils.Regex;

import java.util.*;

public class HouseServicesImpl implements FacilityService {
    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    private static List<House> houseArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();
    WriteFileHouse writeFileHouse = new WriteFileHouse();


//    static {
//        houseIntegerMap.put(new House("1", "ada", 43, 30000, 4, "tháng", "phòng đôi", 1), 0);
//        houseIntegerMap.put(new House("2", "eqw", 54, 5343, 4, "tháng", "phòng đôi", 1), 0);
//        houseIntegerMap.put(new House("3", "xcv", 98, 32445, 4, "tháng", "phòng đôi", 1), 0);
//    }

    @Override
    public  void add() {
        String id = inputId();
        String nameService = inputNameService();
        double usableArea = Double.parseDouble(inputArea());
        double rentalCosts = Double.parseDouble(inputCost());
        int maximumPeople = Integer.parseInt(inputPerson());
        String rentalType = inputTypeRent();
        String standardRoom = inputStandardRoom();
        System.out.print("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House houses = new House(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, numberFloor);
        houseIntegerMap.put(houses, 0);
        houseArrayList.add(houses);
        writeFileHouse.writeStringListToCSV(houseArrayList, "src/case_study/data/house.csv", false);

    }

    @Override
    public void display() {
//        List<House> houseList =
        for (Map.Entry<House, Integer> houseEntry : houseIntegerMap.entrySet()) {
            System.out.println(houseEntry.getKey() + " " + houseEntry.getValue());
        }
    }

    private String inputId() {
        System.out.println("Nhập mã dịch vụ: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_ID, "Mã dịch vụ theo định dạng là SVXX-YYYY!!");
    }

    private String inputArea() {
        System.out.println("Nhập diện tích sử dụng: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_AREA, "Diện tích phải lớn hơn 30");
    }

    private String inputNameService() {
        System.out.println("Nhập tên dịch vụ: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_NAME, "Viết hoa chữ cái đầu và các chữ sau viết thường");
    }

    private String inputCost() {
        System.out.println("Nhập chi phí thuê: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_INT, "Chi phí thuê phải lớn hơn 0");
    }

    private String inputPerson() {
        System.out.println("Nhập số lượng người ở tối đa: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_PERSON, "Số lượng người phải >0 và <20");
    }

    private String inputTypeRent() {
        System.out.println("Nhập kiểu thuê: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_NAME, "Kiểu thuê: năm, tháng, ngày, giờ");
    }

    private String inputStandardRoom() {
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return regex.checkRegex(scanner.nextLine(), regex.REGEX_NAME, "Viết hoa chữ cái đầu");
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
