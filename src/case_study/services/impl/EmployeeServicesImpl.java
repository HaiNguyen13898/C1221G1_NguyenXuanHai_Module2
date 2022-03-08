package case_study.services.impl;

import case_study.models.person.Employee;
import case_study.services.EmployeeService;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServicesImpl implements EmployeeService {

    ArrayList <Employee> employeeArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }
}
