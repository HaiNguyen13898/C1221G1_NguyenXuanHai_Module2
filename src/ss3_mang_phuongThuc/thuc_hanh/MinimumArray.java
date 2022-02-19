package ss3_mang_phuongThuc.thuc_hanh;

public class MinimumArray {
    public static void main(String[] args) {
        int [] arr = { 3, 6, 7, 9, 2, 1};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất của mảng là " + arr[index]);

    }
    public static int minValue ( int[] array ) {
        int index = 0;
        for (int i = 1; i < array.length ;i++){
            if( array[i] < array[index] ){
                index = i;
            }
        }
        return index;
    }
}
