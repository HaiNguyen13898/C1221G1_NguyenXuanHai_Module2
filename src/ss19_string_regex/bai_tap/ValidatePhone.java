package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public  static  void phone(){
        Scanner scanner =new Scanner(System.in);
        System.out.println(" moi nhap sdt");
        String phone=scanner.nextLine();
        Pattern pattern= Pattern.compile("^[0][0-9]{9}");
        Matcher m=pattern.matcher(phone);
        System.out.println(m.matches());
    }
    public static void main(String[] args) {
        phone();
    }
}
