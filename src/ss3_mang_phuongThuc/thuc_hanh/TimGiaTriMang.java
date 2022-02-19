package ss3_mang_phuongThuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriMang {
    public static void main(String[] args) {
        String [] listName = {"Hai", "Hien", "Phuong", "Khoa", "Truong"};
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = sr.nextLine();
        boolean check = false;
        for ( int i = 0; i < listName.length; i++){
            if ( listName[i].equals(name)){
                System.out.println("Vị trí tên của người bạn trong danh sách " + i + " tên của người đó là " + name );
                check = true;
                break;
            } if (!check){
                System.out.println("Giá trị cần tìm không có trong mảng");
                break;
            }
        }
    }
}
