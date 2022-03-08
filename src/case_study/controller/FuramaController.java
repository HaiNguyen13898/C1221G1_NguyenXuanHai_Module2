package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public void displayMenu() {
        int choose1, choose2, choose3;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("======Manin Menu======");
            System.out.print(" 1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "Enter your choice: ");
            choose1 = Integer.parseInt(scanner.nextLine());
            switch (choose1) {
                case 1:
                    System.out.println("===== Menu Employee =====");
                    System.out.print("1.Display list employees\n" +
                            "2.Add new employee\n" +
                            "3.Edit employee\n" +
                            "4.Return main menu\n" +
                            "Enter your choice: ");
                    choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("===== Menu Customer =====");
                    System.out.print("1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n" +
                            "Enter your choice: ");
                    choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("===== Menu Facility =====");
                    System.out.print("1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu\n" +
                            "Enter your choice: ");
                    choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("===== Menu Booking =====");
                    System.out.print("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu\n" +
                            "Enter your choice: ");
                    choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;

                    }
                    break;
                case 5:
                    System.out.println("===== Menu Promotion =====");
                    System.out.print("1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu\n" +
                            "Enter your choice: ");
                    choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    break;
                default:
                    System.out.println("You better go away, you little shit!!!");
                    flag = false;
                    break;
            }

        }while (flag) ;
    }
}