package ss2_vongLap.bai_tap;

import java.util.Scanner;

public class PrimeNumberSmallerOneHundred {
    public static void main(String[] args) {
        System.out.println(" Nhập số lượng số nguyên tố muốn in:  ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check && n < 100 ) {
                System.out.print(n + "\t");
                count++;
            }
            n++;
        }

    }
}
