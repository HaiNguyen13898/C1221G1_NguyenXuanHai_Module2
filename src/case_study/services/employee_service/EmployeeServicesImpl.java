package case_study.services.employee_service;

import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServicesImpl implements EmployeeService {

    private static List<Employee> employeeArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

//    static {
//        employeeArrayList.add(new Employee(1, "Nguyen Xuan Hai", "13/08/1998", "Nam", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
//        employeeArrayList.add(new Employee(2, "Tran Minh Hoang", "11/02/1988", "Nam", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
//        employeeArrayList.add(new Employee(3, "Nguyen Thanh Tung", "02/01/1994", "Nam", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
//        employeeArrayList.add(new Employee(4, "Bui Thi Mai", "04/06/1974", "Nữ", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
//        employeeArrayList.add(new Employee(5, "Tran Xuan Hien", "27/07/2005", "Nữ", "001098001438", "0935264228", "hainguyen13@gmail.com", "trùm", "Trưởng phòng", 65000000));
//    }

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
        System.out.print("Trung cấp\n" +
                "Cao đẳng\n" +
                "Đại học\n" +
                "Sau đại học\n" +
                "Nhập trình độ: ");
        String standard = scanner.nextLine();
        System.out.print("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.print("Nhập mức lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employees = new Employee(id, name, dateBirth, gender, idCard, phoneNumber, email, standard, position, salary);
        employeeArrayList.add(employees);
        WriteFileEmployee.writeStringListToCSV(employeeArrayList, "src/case_study/data/employee.csv", false);
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadFileEmployee.readEmployeeFromCSV();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void edit() {
        display();
        System.out.print("Nhập id thông tin nhân viên bạn cần thay đổi: ");
        int id = Integer.parseInt(scanner.nextLine());
        int choose;
        System.out.print("===Change information===\n" +
                "1.Name\n" +
                "2.Day of birth\n" +
                "3.Gender\n" +
                "4.Identification  \n" +
                "5.Phone number\n" +
                "6.Email\n" +
                "7.Standard\n" +
                "8.Position\n" +
                "9.Salary\n" +
                "Enter your choice: ");
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.print("Sửa tên: ");
                String name = scanner.nextLine();
                employeeArrayList.get(id - 1).setName(name);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 2:
                System.out.print("Sửa ngày tháng năm sinh: ");
                String dateBirth = scanner.nextLine();
                employeeArrayList.get(id - 1).setDayOfBirth(dateBirth);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 3:
                System.out.print("Sửa giới tính: ");
                String gender = scanner.nextLine();
                employeeArrayList.get(id - 1).setGender(gender);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 4:
                System.out.print("Sửa số CMND: ");
                String identification = scanner.nextLine();
                employeeArrayList.get(id - 1).setIdentityCard(identification);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 5:
                System.out.print("Sửa số điện thoại: ");
                String phoneNumber = scanner.nextLine();
                employeeArrayList.get(id - 1).setPhoneNumber(phoneNumber);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 6:
                System.out.print("Sửa số email: ");
                String email = scanner.nextLine();
                employeeArrayList.get(id - 1).setEmail(email);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 7:
                System.out.print("Sửa trình độ: ");
                String standard = scanner.nextLine();
                employeeArrayList.get(id - 1).setStandard(standard);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 8:
                System.out.print("Sửa vị trí: ");
                String position = scanner.nextLine();
                employeeArrayList.get(id - 1).setPosition(position);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 9:
                System.out.print("Sửa lương: ");
                double salary = Double.parseDouble(scanner.nextLine());
                employeeArrayList.get(id - 1).setSalary(salary);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
        }
    }

    @Override
    public void delete() {

    }
}
