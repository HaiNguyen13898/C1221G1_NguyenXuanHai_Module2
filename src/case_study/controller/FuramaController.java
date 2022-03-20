package case_study.controller;

import case_study.services.customer_service.CustomerServicesImpl;
import case_study.services.employee_service.EmployeeServicesImpl;
import case_study.services.facility_service.house_service.HouseServicesImpl;
import case_study.services.facility_service.room_service.RoomServicesImpl;
import case_study.services.facility_service.villa_service.VillaServicesImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMenu() {
        int choose1 = 0, choose2 = 0, choose3 = 0, choose4 = 0;
        boolean flag = true;
        boolean check = false;
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
                    "Enter your choice: \n");
            try {
                while (true) {
                    choose1 = Integer.parseInt(scanner.nextLine());
                    if (choose1 < 0) {
                        System.out.println("Nhập lại đuê bitch, phải dương đời mới lên hương");
                    } else if (choose1 > 6) {
                        System.out.println("Thấy cái lựa chọn có số nào lớn hơn 6 không???? WTF, nhập lại nè: ");
                    } else {
                        break;
                    }
                }
                switch (choose1) {
                    case 1:
                        do {
                            System.out.println("===== Menu Employee =====");
                            System.out.print("1.Display list employees\n" +
                                    "2.Add new employee\n" +
                                    "3.Edit employee\n" +
                                    "4.Return main menu\n" +
                                    "Enter your choice: ");
                            try {
                                while (true) {
                                    choose2 = Integer.parseInt(scanner.nextLine());
                                    if (choose2 < 0) {
                                        System.out.println("Nhập lại đuê bitch, đã bảo là phải dương");
                                    } else if (choose2 > 4) {
                                        System.out.println("Thấy cái lựa chọn có số nào lớn hơn 4 không???? WTF làm lại nà: ");
                                    } else {
                                        break;
                                    }
                                }
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
                            } catch (NumberFormatException e) {
                                System.out.println("Lại nhập sai!!! Tau nản rồi nha, lại đê m");
                                continue;
                            }
                        } while (!flag);
                        break;
                    case 2:
                        do {
                            System.out.println("===== Menu Customer =====");
                            System.out.print("1.Display list customers\n" +
                                    "2.Add new customer\n" +
                                    "3.Edit customer\n" +
                                    "4.Return main menu\n" +
                                    "Enter your choice: ");
                            try {
                                while (true) {
                                    choose3 = Integer.parseInt(scanner.nextLine());
                                    if (choose3 < 0) {
                                        System.out.println("Làm ơn!!!!!!!");
                                    } else if (choose3 > 4) {
                                        System.out.println("Are u fucking kidding me");
                                    } else {
                                        break;
                                    }
                                }
                                switch (choose3) {
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
                            } catch (NumberFormatException e) {
                                System.out.println("Ngôn từ bất lực, thì bạo lực sẽ lên ngôi");
                                continue;
                            }
                        } while (!flag);
                        break;
                    case 3:
                        do {
                            System.out.println("===== Menu Facility =====");
                            System.out.print("1.Display list facility\n" +
                                    "2.Add new facility\n" +
                                    "3.Display list facility maintenance\n" +
                                    "4.Return main menu\n" +
                                    "Enter your choice: ");
                            try {
                                while (true) {
                                    choose4 = Integer.parseInt(scanner.nextLine());
                                    if (choose4 < 0) {
                                        System.out.println("Nhập lại đuê bitch, phải dương đời mới lên hương");
                                    } else if (choose4 > 4) {
                                        System.out.println("Thấy cái lựa chọn có số nào lớn hơn 4 không???? WTF, nhập lại nè: ");
                                    } else {
                                        break;
                                    }
                                }
                                switch (choose4) {
                                    case 1:
                                        int choice1;
                                        do {
                                            System.out.print("1.Display house\n" +
                                                    "2.Display room\n" +
                                                    "3.Display villa\n" +
                                                    "4.Return main menu\n" +
                                                    "5.Enter your choice: ");
                                            try {
                                                while (true) {
                                                    choice1 = Integer.parseInt(scanner.nextLine());
                                                    if (choice1 < 0) {
                                                        System.out.println("Nhập lại đuê bitch, phải dương đời mới lên hương");
                                                    } else if (choice1 > 4) {
                                                        System.out.println("Thấy cái lựa chọn có số nào lớn hơn 4 không???? WTF, nhập lại nè: ");
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                switch (choice1) {
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
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ngôn từ bất lực, thì bạo lực sẽ lên ngôi");
                                                continue;
                                            }
                                        } while (!flag);
                                        break;
                                    case 2:
                                        int choice2;
                                        do {
                                            System.out.print("1.Add new house\n" +
                                                    "2.Add new room\n" +
                                                    "3.Add new villa\n" +
                                                    "4.Return main menu\n" +
                                                    "5.Enter your choice: ");
                                            try {
                                                while (true) {
                                                    choice2 = Integer.parseInt(scanner.nextLine());
                                                    if (choice2 < 0) {
                                                        System.out.println("Nhập lại đuê bitch, phải dương đời mới lên hương");
                                                    } else if (choice2 > 4) {
                                                        System.out.println("Thấy cái lựa chọn có số nào lớn hơn 4 không???? WTF, nhập lại nè: ");
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                switch (choice2) {
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
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ngôn từ bất lực, thì bạo lực sẽ lên ngôi");
                                                continue;
                                            }
                                        } while (!flag);
                                    case 3:
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Ngôn từ bất lực, thì bạo lực sẽ lên ngôi, ra chọn lại từ đầu đi: ");
                                continue;
                            }
                        } while (!flag);
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

            } catch (NumberFormatException e) {
                System.out.println("Nhập sai rồi, nhập lại đi, phải nhập số chứ ai lại nhập chữ để chọn?????\n" +
                        "Menu đó, nhìn và nhập lại đi em!!!!!");
                continue;
            }
        } while (flag);
    }
}
