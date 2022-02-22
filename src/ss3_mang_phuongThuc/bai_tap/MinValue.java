package ss3_mang_phuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng:");
        size = scanner.nextInt();

        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử của mảng" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(array));

        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Phần tử nhỏ nhất của mảng là " + min + " , tại vị trí " + index);
    }
}
