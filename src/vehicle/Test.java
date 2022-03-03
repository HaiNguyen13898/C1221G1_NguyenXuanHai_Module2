package vehicle;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, choice1, choice2, choice3;


        MotobikeManager motobikeManager = new MotobikeManager();
        CarManager carManager = new CarManager();
        TruckManager truckManager = new TruckManager();
        boolean flag = true;
        do {
            System.out.println("--------Menu--------");
            System.out.print("Chọn 1 để nhập thông tin phương tiện\n" +
                    "Chon 2 để hiện thị phương tiện\n" +
                    "Chọn 3 để xoá phương tiện\n" +
                    "Chọn 4 để thoát\n"+
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
                            truckManager.addTruck();
                            break;
                        case 2:
                            carManager.addCar();
                            break;
                        case 3:
                            motobikeManager.addMotobike();
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
                            truckManager.displayTruck();
                            break;
                        case 2:
                            carManager.displayCar();
                            break;
                        case 3:
                            motobikeManager.displayMotobike();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Chọn 1 để xoá xe tải\n" +
                            "Chọn 2 để xoá ô tô\n" +
                            "Chọn 3 để xoá xe máy\n" +
                            "Vui lòng nhập lựa chọn của bạn: ");
                    choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3){
                        case 1:
                            truckManager.removeTruck();
                            break;
                        case 2:
                            carManager.removeCar();
                            break;
                        case 3:
                            motobikeManager.removeMotobike();
                            break;
                    }
                    break;

            }
        } while (flag);

    }


}
