package ss17_io_binary_file_serialization.bai_tap;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        int choose;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        ProductServices pr = new ProductServices();
        do {
            System.out.println("======Menu=====");
            System.out.print("1.add new product\n" +
                    "2.display product\n" +
                    "3.exit\n" +
                    "enter ur choice: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Mời bạn nhập thông tin sản phẩm");
                    pr.add();
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm");
                    pr.display();
                    break;
                default:
                    System.out.println("Hẹn gặp lại");
                    check = false;
                    break;
            }

        }while (check);
    }
}
