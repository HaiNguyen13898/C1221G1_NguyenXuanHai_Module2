package oop_review.vehicle;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        int choice;
        int number;
        boolean flag = true;
        do {
            System.out.println("----------MENU----------");
            System.out.println("Nhập số 1 để tạo các đối tượng xe và nhập thông tin \n" +
                    "Nhập số 2 để xuất bảng kê khai tiền thuế của các xe.\n" +
                    "Nhập số khác để thoát");
            System.out.println(" Nhập số lượng xe cần điền thông tin: ");
            number = sc.nextInt();
            System.out.print("Nhập lựa chọn trên menu của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < number ; i++) {
                        if ( vehicles[i] == null) {
                            System.out.println("Xe thứ " + (i + 1));
                            vehicles[i] = new Vehicle();
                            nhapXe(vehicles[i]);
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < number; i++) {
                        vehicles[i].hienThiThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    static void nhapXe(Vehicle xe) {
        System.out.print("Nhập biển số xe: ");
        xe.setBienSoXe(sc.nextInt());
        System.out.print("Nhập tên chủ xe: ");
        xe.setChuXe(sc.nextLine());
        sc.nextLine();
        System.out.print("Nhập dung tích xe ( đơn vị CC) : ");
        xe.setDungTich(sc.nextInt());
        System.out.print("Nhập màu sắc của xe: ");
        xe.setMausac(sc.nextLine());
        sc.nextLine();
        System.out.print("Nhập giá trị của xe: ");
        xe.setTriGia(sc.nextInt());
    }
}
