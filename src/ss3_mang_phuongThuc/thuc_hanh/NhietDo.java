package ss3_mang_phuongThuc.thuc_hanh;

import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c, f;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. C sang F");
            System.out.println("2. F sang C");
            System.out.println("Nhập chế độ bạn muốn chuyển đổi");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Nhập nhiệt độ C");
                    c = scanner.nextDouble();
                    System.out.println("Nhiệt độ C sang độ F có giá trị = " + cToF(c));
                    break;
                }
                case 2: {
                    System.out.println("Nhập nhiệt độ F");
                    f = scanner.nextDouble();
                    System.out.println("Nhiệt độ F sang nhiệt độ C có giá trị = " + ftoC(f));
                    break;
                }
                case 3 : {
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }
    public static double cToF ( double c ) {
        double f = (9.0 / 5) * c + 32;
        return  f;
    }
    public static double ftoC( double f ) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
