package case_study.controller;

import case_study.services.customer_service.CustomerServicesImpl;
import case_study.services.employee_service.EmployeeServicesImpl;
import case_study.services.facility_service.house_service.HouseServicesImpl;
import case_study.services.facility_service.room_service.RoomServicesImpl;
import case_study.services.facility_service.villa_service.VillaServicesImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMenu()  {
        int choose1, choose2, choose3;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        EmployeeServicesImpl employeeServices = new EmployeeServicesImpl();
        CustomerServicesImpl customerServices = new CustomerServicesImpl();
        HouseServicesImpl houseServices = new HouseServicesImpl();
        RoomServicesImpl roomServices = new RoomServicesImpl();
        VillaServicesImpl villaServices = new VillaServicesImpl();
        do {
            System.out.println("======Manin Menu======");
            System.out.print("1.Employee Management\n" +
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
                            employeeServices.display();
                            break;
                        case 2:
                            employeeServices.add();
                            break;
                        case 3:
                            employeeServices.edit();
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
                            customerServices.display();
                            break;
                        case 2:
                            customerServices.add();
                            break;
                        case 3:
                            customerServices.edit();
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
                            int choice1;
                            System.out.print("1.Display house\n"+
                                    "2.Display room\n"+
                                    "3.Display villa\n"+
                                    "4.Return main menu\n"+
                                    "5.Enter your choice: ");
                            choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1){
                                case 1:
                                    System.out.println("====HOUSE====");
                                    houseServices.display();
                                    break;
                                case 2:
                                    System.out.println("====ROOM====");
                                    roomServices.display();
                                    break;
                                case 3:
                                    System.out.println("====VILLA====");
                                    villaServices.display();
                                    break;
                            }
                            break;
                        case 2:
                            int choice2;
                            System.out.print("1.Add new house\n"+
                                    "2.Add new room\n"+
                                    "3.Add new villa\n"+
                                    "4.Return main menu\n"+
                                    "5.Enter your choice: ");
                            choice2 = Integer.parseInt(scanner.nextLine());
                            switch (choice2){
                                case 1:
                                    houseServices.add();
                                    break;
                                case 2:
                                    roomServices.add();
                                    break;
                                case 3:
                                    villaServices.add();
                                    break;
                            }

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

        } while (flag);
    }
}
