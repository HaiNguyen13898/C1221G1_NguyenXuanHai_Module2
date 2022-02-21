package ss3_mang_phuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        System.out.println("Mảng vừa lặp " + Arrays.toString(array));

        System.out.println("Nhập phần tử cần xoá khỏi mảng ");
        int x = input.nextInt();

        for (int j = 0; j < array.length; j++ ) {
            if (array[j] == x) {
                for (int k = j; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                j--;
                array[array.length - 1] = 0;
            }


        }
        System.out.println("Mảng mới là" + Arrays.toString(array));

    }
}
