package ss3_mang_phuongThuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Nhập phần tử của mảng arr");
        int size = input.nextInt();
        int [] arr = new int [ 10 ];

        for (int i = 0; i < size ;i++) {
            System.out.print("Nhập phần tử thứ " + i + " ");
            arr[i] = input.nextInt();
        }

        System.out.println("Mang ban đầu "+ Arrays.toString(arr));

        System.out.println("Nhập phần tử cần thêm vào mảng");
        int num = input.nextInt();

        System.out.println("Nhập vị trí cần chèn");
        int index = input.nextInt();

        for ( int i = size; i > index; i-- ){
            arr[i] = arr[ i - 1 ];
        }
        arr[index] = num;

        System.out.println("Mảng đã được chỉnh sửa" + Arrays.toString(arr));

    }
}
