package case_study.services.customer_service;

import case_study.models.person.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServicesImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
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
                "7.TypeOfGuest\n" +
                "8.Address\n" +
                "Enter your choice: ");
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.print("Sửa tên: ");
                String name = scanner.nextLine();
                customerList.get(id - 1).setName(name);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 2:
                System.out.print("Sửa ngày tháng năm sinh: ");
                String dateBirth = scanner.nextLine();
                customerList.get(id - 1).setDayOfBirth(dateBirth);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 3:
                System.out.print("Sửa giới tính: ");
                String gender = scanner.nextLine();
                customerList.get(id - 1).setGender(gender);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 4:
                System.out.print("Sửa số CMND: ");
                String identification = scanner.nextLine();
                customerList.get(id - 1).setIdentityCard(identification);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 5:
                System.out.print("Sửa số điện thoại: ");
                String phoneNumber = scanner.nextLine();
                customerList.get(id - 1).setPhoneNumber(phoneNumber);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 6:
                System.out.print("Sửa số email: ");
                String email = scanner.nextLine();
                customerList.get(id - 1).setEmail(email);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 7:
                System.out.print("Sửa loại khách: ");
                String kinOfCustomer = scanner.nextLine();
                customerList.get(id - 1).setKindsOfCustomer(kinOfCustomer);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;
            case 8:
                System.out.print("Sửa địa chỉ: ");
                String address = scanner.nextLine();
                customerList.get(id - 1).setAddress(address);
                System.out.println("Đã sửa thành công!!!");
                display();
                break;

        }
    }

    @Override
    public void delete() {
    }
}
