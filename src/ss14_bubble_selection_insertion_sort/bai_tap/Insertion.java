package ss14_bubble_selection_insertion_sort.bai_tap;

import java.util.Arrays;

public class Insertion {

    static int[] list = {2, 3, 8, 5, 6, 1, -2, 7, 14, 0};

    public static void iSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
                System.out.println(" Lần thứ " + i + " " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("Sau lần thứ " + i + " " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        iSort(list);
        System.out.println(list);

        for (int l : list) {
            System.out.print(l + " ");
        }
    }
}
