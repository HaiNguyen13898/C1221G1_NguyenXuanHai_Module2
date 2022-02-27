package oop_review.vehicle;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice ;
        int number = 0;
        Vehicle[] vehicles = null;
        boolean flag = true;
        do {
            System.out.println("----------MENU----------");
            System.out.println("Nhập số 1 để tạo các đối tượng xe và nhập thông tin \n" +
                    "Nhập số 2 để xuất bảng kê khai tiền thuế của các xe.\n" +
                    "Nhập số khác để thoát");
            System.out.print("Nhập lựa chọn trên menu của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng xe cần điền thông tin: ");
                    number = sc.nextInt();
                    vehicles = new Vehicle[number];
                    for (int i = 0; i < number ; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        vehicles[i] = new Vehicle();
                        nhapXe(vehicles[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < number; i++) {
                        vehicles[i].hienThiThue();
                    }
                    break;
                default:
                    System.out.println("Hẹn gặp lại");
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
