package demo.student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        ManagerStudent student = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Menu: \n " +
                    "1.add \n" +
                    "2.display \n" +
                    "3.edit\n" +
                    "4.delete\n" +
                    "5.search\n" +
                    "6.exit\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 2 : {
                    System.out.println("Hiển thị danh sách");
                    student.showListStudent();
                    break;
                }
            }
        }while (!check);
    }
}
