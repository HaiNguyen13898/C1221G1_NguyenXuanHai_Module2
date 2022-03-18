package case_study.utils;

import java.util.Scanner;

public class Regex {

    //Cách 1
    public static final String REGEX_ID = "^SV(VL|HO|RO)[-]\\d{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static final String REGEX_INT = "^[1-9][0-9]*$";
    public static final String REGEX_PERSON = "^[1-9]|[1][0-9]$";
    static Scanner sc = new Scanner(System.in);
    public static String checkRegex(String string, String regex, String err) {
        boolean check = true;
        do {
            if (string.matches(regex)) {
                check = false;
            } else {
                System.out.println(err);
                string = sc.nextLine();
            }
        } while (check);
        return string;
    }


    //cách 2
    public static boolean checkId(String id) {
        String idCheck = "^SV(VL|HO|RO)[-]\\d{4}$";
        if(id.matches(idCheck)){
            return true;
        }else {
            System.out.println("Nhập sai, vui lòng nhập lại (SVXX-XXXX)");
            return false;
        }
    }

    public static boolean checkName(String name) {
        String nameCheck = "^[A-Z][a-z]+";
        if (name.matches(nameCheck)){
            return true;
        }else {
            System.out.println("Nhập sai, vui lòng nhập lại (viết hoa chữ cái đầu)");
            return false;
        }
    }
    public static boolean checkArea (String area) {
        String areaCheck = "^([3-9]\\d|[1-9]\\d{2,})$";
        if (area.matches(areaCheck)){
            return true;
        }else {
            System.out.println("Nhập sai, vui lòng nhập lại");
            return false;
        }
    }

    public static boolean checkCost (String cost) {
        String costCheck = "^[1-9][0-9]*$";
        if (cost.matches(costCheck)){
            return true;
        }else {
            System.out.println("Nhập sai vui lòng nhập lại (giá tiền phải lớn hơn 0)");
            return false;
        }
    }

    public static boolean checkPerson (String person) {
        String personCheck = "^[1-9]|[1][0-9]$";
        if (person.matches(personCheck)){
            return true;
        }else {
            System.out.println("Nhập sai vui lòng nhập lại");
            return false;
        }
    }

}
