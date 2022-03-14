package case_study.services.customer_service;

import case_study.models.person.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServicesImpl implements CustomerService {
    static List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "Nguyễn Văn A", "21/2/221", "Nam", "234023", "0626122132", "ashsadh@fasd.com", "Diamond", "94 lê quang đạo"));
        customerList.add(new Customer(2, "Nguyễn Văn B", "21/12/01", "Nữ", "234023", "0626122132", "ashsadh@fasd.com", "Diamond", "94 lê quang đạo"));
        customerList.add(new Customer(3, "Nguyễn Văn C", "1/2/021", "Nữ", "234023", "0626122132", "ashsadh@fasd.com", "Diamond", "94 lê quang đạo"));
        customerList.add(new Customer(4, "Nguyễn Văn D", "21/1/2021", "Nam", "234023", "0626122132", "ashsadh@fasd.com", "Diamond", "94 lê quang đạo"));
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
        System.out.print("Diamond\n" +
                "Platinium\n" +
                "Gold\n" +
                "Silver\n" +
                "Member\n" +
                "Nhập loại khách hàng: ");
        String typeOfGuest = scanner.nextLine();
        System.out.print("Nhập địa chỉ khách: ");
        String address = scanner.nextLine();
        Customer customers = new Customer(id, name, dateBirth, gender, idCard, phoneNumber, email, typeOfGuest, address);
        customerList.add(customers);
    }

    @Override
    public void display() {
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void edit() {


    }

    @Override
    public void delete() {

    }
}
