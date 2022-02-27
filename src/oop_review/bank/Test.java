package oop_review.bank;


import java.util.Scanner;

public class Test {

    static Scanner scanner = new Scanner(System.in);

    static void information(Account inform) {
        System.out.println("Nhập tên tài khoản");
        inform.setNameAccount(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Nhập số tài khoản");
        inform.setNumberAccount(scanner.nextLong());
    }

    public static void main(String[] args) {
        int choice;
        int number = 0;
        Account[] accounts = null;
        boolean flag = true;
        do {
            System.out.println("----------MENU----------");
            System.out.println("Nhập số 1 để tạo thông tin về tài khoản ngân hàng của khách \n" +
                    "Nhập số 2 để nộp tiền vào tài khoản của bạn.\n" +
                    "Nhập số 3 để rút tiền.\n" +
                    "Nhập số 4 để đáo hạn.\n" +
                    "Nhập số 5 để thoát");
            System.out.print("Nhập lựa chọn trên menu của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng tài khoản cần điền thông tin");
                    number = scanner.nextInt();
                    accounts = new Account[number];
                    for (int i = 0; i < number; i++) {
                        System.out.println("Khách hàng số: " + (i + 1));
                        accounts[i] = new Account();
                        information(accounts[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < number; i++) {
                        accounts[i].putMoney();
                    }
                case 3:
                    for (int i = 0; i < number; i++) {
                        accounts[i].takeMoney();
                    }
                    break;
                case 4:
                    for (int i = 0; i < number; i++) {
                        accounts[i].expire();
                    }
                    break;
                default:
                    System.out.println("kiếm thêm tiền đi");
                    flag = false;
                    break;
            }

        } while (flag);

    }
}
