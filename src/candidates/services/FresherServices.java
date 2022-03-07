package candidates.services;

import candidates.models.Fresher;
import java.util.ArrayList;
import java.util.Scanner;

public class FresherServices implements CandidatesServices {
    ArrayList<Fresher> fresherList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Enter your id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your fist name: ");
        String fName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lName = scanner.nextLine();
        System.out.print("Enter your birth date: ");
        String bDate = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        int pNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your graduation date: ");
        String gDate = scanner.nextLine();
        System.out.print("Enter your graduation rank: ");
        String gRank = scanner.nextLine();
        System.out.print("Enter your education: ");
        String education = scanner.nextLine();
        Fresher freshers = new Fresher(id, fName, lName, bDate, address, pNumber, email, gDate, gRank, education);
        fresherList.add(freshers);
    }

    @Override
    public void display() {
        System.out.println("------FRESHER CANDIDATE-----");
        for (int i = 0; i < fresherList.size(); i++) {
            String name = fresherList.get(i).getFistName() +" "+ fresherList.get(i).getLastName();
            System.out.println(name);
        }
    }

    @Override
    public void search() {
        System.out.print("Enter the name you want see the information: ");
        String strFresher = scanner.nextLine();
        for (int i = 0; i < fresherList.size(); i++) {
            if ( fresherList.get(i).getFistName().contains(strFresher)  || fresherList.get(i).getLastName().contains(strFresher)) {
                System.out.print(fresherList.get(i).getFistName() + " " + fresherList.get(i).getLastName() + " || ");
                System.out.print(fresherList.get(i).getBirthDate() + " || ");
                System.out.print(fresherList.get(i).getAddress() + " || " );
                System.out.print(fresherList.get(i).getPhoneNumber() + " || ");
                System.out.print(fresherList.get(i).getEmail() + " || ");
                System.out.println(fresherList.get(i).fresher);
            }
        }

    }
}
