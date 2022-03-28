package case_study.services.employee_service;

import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServicesImpl implements EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    String[] level = {"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"};

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

        String standard = null;
        boolean check;
        do {
            System.out.print("1.Trung cấp\n" +
                    "2.Cao đẳng\n" +
                    "3.Đại học\n" +
                    "4.Sau đại học\n" +
                    "Nhập trình độ: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    standard = level[0];
                    check = true;
                    break;
                case 2:
                    standard = level[1];
                    check = true;
                    break;
                case 3:
                    standard = level[2];
                    check = true;
                    break;
                case 4:
                    standard = level[3];
                    check = true;
                    break;
                default:
                    System.out.println("Nhập sai òi, lại đi người anh em");
                    check = false;
            }
        } while (!check);

        System.out.print("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.print("Nhập mức lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employees = new Employee(id, name, dateBirth, gender, idCard, phoneNumber, email, standard, position, salary);
        employeeList.add(employees);
        WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);
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
        List<Employee> employeeList = ReadFileEmployee.readEmployeeFromCSV();
        display();
//        Employee employee = null;
        System.out.print("Nhập id thông tin nhân viên bạn cần thay đổi: ");
        int id = Integer.parseInt(scanner.nextLine());
        int choose = 0;
        boolean check = true;
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getId() == id) {
                  //  employee = employeeList.get(i);

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
                            employeeList.get(i).setName(name);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);
                            break;
                        case 2:
                            System.out.print("Sửa ngày tháng năm sinh: ");
                            String dateBirth = scanner.nextLine();
                            employeeList.get(i).setDayOfBirth(dateBirth);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);
                            break;
                        case 3:
                            System.out.print("Sửa giới tính: ");
                            String gender = scanner.nextLine();
                            employeeList.get(i).setGender(gender);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);
                            break;
                        case 4:
                            System.out.print("Sửa số CMND: ");
                            String identification = scanner.nextLine();
                            employeeList.get(i).setIdentityCard(identification);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);

                            break;
                        case 5:
                            System.out.print("Sửa số điện thoại: ");
                            String phoneNumber = scanner.nextLine();
                            employeeList.get(i).setPhoneNumber(phoneNumber);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);

                            break;
                        case 6:
                            System.out.print("Sửa số email: ");
                            String email = scanner.nextLine();
                            employeeList.get(i).setEmail(email);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);

                            break;
                        case 7:
                            System.out.print("Sửa trình độ: ");
                            String standard = scanner.nextLine();
                            employeeList.get(i).setStandard(standard);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);

                            break;
                        case 8:
                            System.out.print("Sửa vị trí: ");
                            String position = scanner.nextLine();
                            employeeList.get(i).setPosition(position);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);
                            break;
                        case 9:
                            System.out.print("Sửa lương: ");
                            double salary = Double.parseDouble(scanner.nextLine());
                            employeeList.get(i).setSalary(salary);
                            WriteFileEmployee.writeStringListToCSV(employeeList, "src/case_study/data/employee.csv", false);
                            break;
                    }
                    break;
                }
                check = true;
            }
            if (!check){
                System.out.println("KHÔNG TÌM THẤY ID BẠN CẦN THAY ĐỔI");
            }
        }

        @Override
        public void delete () {

        }
    }
