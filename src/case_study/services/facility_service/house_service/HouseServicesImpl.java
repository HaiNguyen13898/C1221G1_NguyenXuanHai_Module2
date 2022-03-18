package case_study.services.facility_service.house_service;

import case_study.models.facility.House;
import case_study.services.facility_service.FacilityService;
import case_study.utils.Regex;

import java.util.*;

public class HouseServicesImpl implements FacilityService {
    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    private static List<House> houseArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String[] typeRent = {"Giờ", "Ngày", "Tháng", "Năm"};

//    static {
//        houseIntegerMap.put(new House("1", "ada", 43, 30000, 4, "tháng", "phòng đôi", 1), 0);
//        houseIntegerMap.put(new House("2", "eqw", 54, 5343, 4, "tháng", "phòng đôi", 1), 0);
//        houseIntegerMap.put(new House("3", "xcv", 98, 32445, 4, "tháng", "phòng đôi", 1), 0);
//    }

    @Override
    public void add() {
        String id = inputId();
        String nameService = inputNameService();
        double usableArea = Double.parseDouble(inputArea());
        double rentalCosts = Double.parseDouble(inputCost());
        int maximumPeople = Integer.parseInt(inputPerson());

        String rentalType =null;
        boolean flag ;
        do {
            int choice;
            System.out.print("1.Giờ\n" +
                    "2.Ngày\n" +
                    "3.Tháng\n" +
                    "4.Năm\n" +
                    "5.Nhập lựa kiểu thuê: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    rentalType= typeRent[0];
                    flag = true;
                    break;
                case 2:
                    rentalType= typeRent[1];
                    flag = true;
                    break;
                case 3:
                    rentalType = typeRent[2];
                    flag = true;
                    break;
                case 4:
                    rentalType = typeRent [3];
                    flag =true;
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
                    flag = false;
                    break;
            }
        } while (!flag);

        String standardRoom = inputStandardRoom();
        System.out.print("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House houses = new House(id, nameService, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, numberFloor);
        houseIntegerMap.put(houses, 0);
        houseArrayList.add(houses);
        WriteFileHouse.writeStringListToCSV(houseArrayList, "src/case_study/data/house.csv", false);

    }

    @Override
    public void display() {
        houseArrayList = ReadFileHouse.readHouseFromCSV();
//        for (Map.Entry<House, Integer> houseEntry : houseIntegerMap.entrySet()) {
//            System.out.println(houseEntry.getKey() + " " + houseEntry.getValue());
//        }
        for (House h : houseArrayList) {
            System.out.println(h);
        }
    }

    private String inputId() {
        System.out.println("Nhập mã dịch vụ: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_ID, "Mã dịch vụ theo định dạng là SVXX-YYYY!!");
    }

    private String inputArea() {
        System.out.println("Nhập diện tích sử dụng: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_AREA, "Diện tích phải lớn hơn 30");
    }

    private String inputNameService() {
        System.out.println("Nhập tên dịch vụ: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_NAME, "Viết hoa chữ cái đầu và các chữ sau viết thường");
    }

    private String inputCost() {
        System.out.println("Nhập chi phí thuê: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_INT, "Chi phí thuê phải lớn hơn 0");
    }

    private String inputPerson() {
        System.out.println("Nhập số lượng người ở tối đa: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_PERSON, "Số lượng người phải >0 và <20");
    }


    private String inputStandardRoom() {
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_NAME, "Viết hoa chữ cái đầu");
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
