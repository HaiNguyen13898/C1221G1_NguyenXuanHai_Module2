package ss14_bubble_selection_insertion_sort.thuc_hanh;

public class InsertionSort {

    static int[] list = {2, 3, 8, 5, 6, 1, -2, 7, 14, 0};

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int l: list) {
            System.out.print(l + " ");
        }
    }
}
