package candidates.services;

import candidates.models.Intern;
import java.util.ArrayList;
import java.util.Scanner;

public class IntermServices implements  CandidatesServices{
    ArrayList <Intern> internList = new ArrayList<>();
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
        System.out.print("Enter your major: ");
        String major = scanner.nextLine();
        System.out.print("Enter your semester: ");
        String semester = scanner.nextLine();
        System.out.print("Enter your university name: ");
        String uName = scanner.nextLine();
        Intern interns = new Intern(id, fName, lName, bDate, address, pNumber, email, major, semester, uName);
        internList.add(interns);

    }

    @Override
    public void display() {
        System.out.println("------INTERN CANDIDATE-----");
        for (int i = 0; i < internList.size(); i++) {
            String inter = internList.get(i).getFistName() +" "+ internList.get(i).getLastName();
            System.out.println(inter);
        }
    }

    @Override
    public void search() {
        System.out.print("Enter the name you want see the information: ");
        String strInterm = scanner.nextLine();
        for (int i = 0; i < internList.size(); i++) {
            if ( internList.get(i).getFistName().contains(strInterm)  || internList.get(i).getLastName().contains(strInterm)) {
                System.out.print(internList.get(i).getFistName() + " " + internList.get(i).getLastName() + " || ");
                System.out.print(internList.get(i).getBirthDate() + " || ");
                System.out.print(internList.get(i).getAddress() + " || " );
                System.out.print(internList.get(i).getPhoneNumber() + " || ");
                System.out.print(internList.get(i).getEmail() + " || ");
                System.out.println(internList.get(i).intern);
            }
        }
    }
}
