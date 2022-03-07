package ss14_bubble_selection_insertion_sort.thuc_hanh;

public class SelectionSort {
    static int[] list = {2, 3, 8, 5, 6, 1, -2, 7, 14, 0};

    public static void selectionSort(int[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int l : list) {
            System.out.print(l + " ");
        }
    }
}
