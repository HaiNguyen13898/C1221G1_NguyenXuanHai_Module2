package case_study.services.employee_service;

import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServicesImpl implements EmployeeService {

    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        employeeArrayList.add(new Employee(1, "Nguyen Xuan Hai", "13/08/1998", "Nam", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
        employeeArrayList.add(new Employee(2, "Tran Minh Hoang", "11/02/1988", "Nam", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
        employeeArrayList.add(new Employee(3, "Nguyen Thanh Tung", "02/01/1994", "Nam", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
        employeeArrayList.add(new Employee(4, "Bui Thi Mai", "04/06/1974", "Nữ", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
        employeeArrayList.add(new Employee(5, "Tran Xuan Hien", "27/07/2005", "Nữ", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
    }

    @Override
    public void add() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh: ");
        String dateBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập cmnd: ");
        String idCard = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập địa chỉ email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập trình độ: ");
        String standard = scanner.nextLine();
        System.out.print("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.print("Nhập mức lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employees = new Employee(id, name, dateBirth, gender, idCard, phoneNumber, email, standard, position, salary);
        employeeArrayList.add(employees);
    }

    @Override
    public void display() {
        System.out.println("=====DANH SÁCH NHÂN VIÊN=====");
        for (Employee e : employeeArrayList) {
            System.out.println(e);
        }

    }

    @Override
    public void edit() {
        display();
        System.out.print("Nhập id thông tin nhân viên bạn cần thay đổi: ");
        int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập thông tin bạn cần sửa \n" +
                        "1.Name\n" +
                        "2.Day of birth\n" +
                        "3.Gender\n" +
                        "4.Identification  \n" +
                        "5.Phone number\n" +
                        "6.Email\n" +
                        "7.Standard\n" +
                        "8.Position\n" +
                        "9.Salary\n");
            int choose;
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Sửa tên: ");
                    String name = scanner.nextLine();
                    employeeArrayList.get(id).setName(name);
                    break;
                case 2:
                    System.out.print("Sửa ngày tháng năm sinh: ");
                    String dateBirth = scanner.nextLine();
                    employeeArrayList.get(id).setDayOfBirth(dateBirth);
                    break;
                case 3:
                    System.out.print("Sửa ngày tháng năm sinh: ");
                    String gender = scanner.nextLine();
                    employeeArrayList.get(id).setGender(gender);
                    break;
                case 4:
                    System.out.print("Sửa ngày tháng năm sinh: ");
                    String identification = scanner.nextLine();
                    employeeArrayList.get(id).setIdentityCard(identification);
                    break;
                case 5:
                    String phoneNumber = scanner.nextLine();
                    employeeArrayList.get(id).setPhoneNumber(phoneNumber);
                    break;
                case 6:
                    String email = scanner.nextLine();
                    employeeArrayList.get(id).setEmail(email);
                    break;
                case 7:
                    String standard = scanner.nextLine();
                    employeeArrayList.get(id).setStandard(standard);
                    break;
                case 8:
                    String position = scanner.nextLine();
                    employeeArrayList.get(id).setPosition(position);
                    break;
                case 9:
                    double salary = Double.parseDouble(scanner.nextLine());
                    employeeArrayList.get(id).setSalary(salary);
                    break;
                default:
                    System.out.println("không có thông tin nào cần sửa");
                    break;
            }


        }

    @Override
    public void delete() {

    }
}
