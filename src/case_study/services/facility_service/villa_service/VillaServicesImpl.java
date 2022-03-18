package case_study.services.facility_service.villa_service;

import case_study.models.facility.Villa;
import case_study.services.facility_service.FacilityService;
import case_study.utils.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaServicesImpl implements FacilityService {

    private static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    String[] typeRent = {"Giờ", "Ngày", "Tháng", "Năm"};

    static {
        villaIntegerMap.put(new Villa("1", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("2", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("3", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
        villaIntegerMap.put(new Villa("4", "rty", 64, 8000, 8, "tháng", "deluxe", 60.3, 2), 0);
    }

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

        String standardVilla = inputStandardRoom();
        double swimmingPoolArea = Double.parseDouble(inputArea());
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

    private String inputId (){
        System.out.println("Nhập mã dịch vụ: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_ID, "Mã dịch vụ theo định dạng là SVXX-YYYY!!" );
    }
    private String inputArea (){
        System.out.println("Nhập diện tích sử dụng: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_AREA, "Diện tích phải lớn hơn 30");
    }
    private String inputNameService (){
        System.out.println("Nhập tên dịch vụ: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_NAME, "Viết hoa chữ cái đầu");
    }
    private String inputCost (){
        System.out.println("Nhập chi phí thuê: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_INT, "Chi phí thuê phải lớn hơn 0");
    }
    private String inputPerson (){
        System.out.println("Nhập số lượng người ở tối đa: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_PERSON, "Số lượng người phải >0 và <20");
    }

    private String inputStandardRoom (){
        System.out.println("Nhập tiêu chuẩn phòng: ");
        return Regex.checkRegex(scanner.nextLine(), Regex.REGEX_NAME, "Viết hoa chữ cái đầu");
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
