package ss3_mang_phuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int arr1[] = new int[4];
        int arr2[] = new int[3];
        int arr3[] = new int[arr1.length + arr2.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu mang arr1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("mang arr1:");
        System.out.println(Arrays.toString(arr1));
        System.out.print("\n");
        System.out.println("Nhap phan tu mang arr2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.print("mang arr2:");
        System.out.println(Arrays.toString(arr2));

        System.out.print("\n");

        int j = 0;
        for (int element : arr1) {
            arr3[j] = element;
            j++;
        }
        for (int element : arr2) {
            arr3[j] = element;
            j++;
        }
        System.out.print("mang arr3:");
        System.out.println(Arrays.toString(arr3));

    }

}
