package ss14_bubble_selection_insertion_sort.bai_tap;

import java.util.Arrays;

public class SetUpInsertion {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        int myArray [] = {1, 6, 7, 8, 9, 2, 4};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
