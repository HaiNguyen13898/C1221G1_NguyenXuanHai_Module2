package case_study.utils;

import java.util.Scanner;

public class Regex {

    //Cách 1
    public  final String REGEX_ID = "^SV(VL|HO|RO)\\d{4}$";
    public  final String REGEX_NAME = "^[A-Z][a-z]+";
    public  final String REGEX_AREA = "^([3-9][1-9]|[1-9]\\d{2,}).?\\d*$";
    public  final String REGEX_INT = "^[1-9]|([1][0-9]$)";
    public  final String REGEX_PERSON = "^[1-9]|[1][0-9]$";

    static Scanner sc = new Scanner(System.in);
    public  String checkRegex(String string, String regex, String err) {
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
    public boolean checkId(String id) {
        String idCheck = "^SV(VL|HO|RO)\\d{4}$";
        return id.matches(idCheck);
    }

    public boolean checkName(String name) {
        String nameCheck = "^[A-Z]\\w+\\s?((\\w+)\\s)*([a-z]*)$";
        return name.matches(nameCheck);
    }
    public boolean checkArea (String area) {
        String areaCheck = "([3-9][1-9]*)";
        return area.matches(areaCheck);
    }

    public boolean checkCost (String cost) {
        String costCheck = "^[1-9]|([1][0-9]$)";
        return cost.matches(costCheck);
    }

    public boolean checkPerson (String person) {
        String personCheck = "^[1-9]|([1][0-9]$)";
        return person.matches(personCheck);
    }

}
