package vehicle.controller;

import vehicle.services.CarServicesImpl;
import vehicle.services.MotobikeServicesImpl;
import vehicle.services.TruckServicesImpl;

import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);

    public void displayMenu () {
        int choice, choice1, choice2, choice3;

        MotobikeServicesImpl motobikeManager = new MotobikeServicesImpl();
        CarServicesImpl carManager = new CarServicesImpl();
        TruckServicesImpl truckManager = new TruckServicesImpl();

        boolean flag = true;
        do {
            System.out.println("--------Menu--------");
            System.out.print("Chọn 1 để nhập thông tin phương tiện\n" +
                    "Chon 2 để hiện thị phương tiện\n" +
                    "Chọn 3 để xoá phương tiện\n" +
                    "Chọn 4 để thoát\n" +
                    "Vui lòng nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Chọn 1 để thêm xe tải\n" +
                            "Chọn 2 để thêm ô tô\n" +
                            "Chọn 3 để thêm xe máy\n" +
                            "Vui lòng nhập lựa chọn của bạn: ");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            truckManager.add();
                            break;
                        case 2:
                            carManager.add();
                            break;
                        case 3:
                            motobikeManager.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn 1 để hiển thị danh sách xe tải\n" +
                            "Chọn 2 để hiện thị danh sách ô tô\n" +
                            "Chọn 3 để hiện thị danh sách  xe máy\n" +
                            "Vui lòng nhập lựa chọn của bạn: ");
                    choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:
                            truckManager.display();
                            break;
                        case 2:
                            carManager.display();
                            break;
                        case 3:
                            motobikeManager.display();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Chọn 1 để xoá xe tải\n" +
                            "Chọn 2 để xoá ô tô\n" +
                            "Chọn 3 để xoá xe máy\n" +
                            "Vui lòng nhập lựa chọn của bạn: ");
                    choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3) {
                        case 1:
                            truckManager.remove();
                            break;
                        case 2:
                            carManager.remove();
                            break;
                        case 3:
                            motobikeManager.remove();
                            break;
                    }
                    break;

                default:
                    System.out.println("Hẹn gặp lại");
                    flag = false;
                    break;
            }
        } while (flag);

    }

}


