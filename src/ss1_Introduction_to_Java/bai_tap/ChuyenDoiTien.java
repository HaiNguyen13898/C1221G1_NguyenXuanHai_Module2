package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        double usd = scanner.nextDouble();
        double vnd = 23000 * usd;
        System.out.println(" USD quy đổi qua VND: " + vnd);
    }
}
