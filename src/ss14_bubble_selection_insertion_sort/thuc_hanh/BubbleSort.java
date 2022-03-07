package ss14_bubble_selection_insertion_sort.thuc_hanh;

public class BubbleSort {

    static int[] list = {2, 3, 8, 5, 6, 1, -2, 7, 14, 0};

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int list: list) {             // duyệt bằng for each
            System.out.print(list + " ");
        }
//        for (int i = 0; i < list.length; i++); cách duyệt bằng for i
//            System.out.print(list[i] + " ");
    }
}
