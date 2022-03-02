package vehicle;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choice = 0;
        int choice1 = 1;
        int choice2 = 1;

        int number = 0;
        Vehicle[] vehicles = null;
        boolean flag = true;
        do {
            System.out.println("--------Menu--------");
            System.out.println("Chọn 1 để nhập thông tin phương tiện\n" +
                    "Chon 2 để hiện thị phương tiện\n" +
                    "Chọn 3 để xoá phương tiện\n" +
                    "Chọn 4 để thoát");

            switch (choice) {
                case 1:
                    System.out.println("Chọn 1 để thêm xe tải\n" +
                            "Chọn 2 để thêm ô tô\n" +
                            "Chọn 3 để thêm xe máy");

                    switch (choice1) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn 1 để hiển thị xe tải\n" +
                            "Chọn 2 để hiện thị ô tô\n" +
                            "Chọn 3 để hiện thị xe máy");
                    switch (choice2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    break;

            }
        } while (flag);

    }


}
