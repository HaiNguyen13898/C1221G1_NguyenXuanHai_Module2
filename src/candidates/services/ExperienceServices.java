package candidates.services;

import candidates.models.Experience;
import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceServices implements CandidatesServices {
    ArrayList <Experience> experienceList = new ArrayList<>();
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
        System.out.print("Enter your exp inYear: ");
        String eYear = scanner.nextLine();
        System.out.print("Enter your skill: ");
        String skill = scanner.nextLine();
        Experience experiences = new Experience(id, fName, lName, bDate, address, pNumber, email, eYear, skill);
        experienceList.add(experiences);
    }
    @Override
    public void display() {
        System.out.println("------EXPERIENCE CANDIDATE-----");
        for (int i = 0; i < experienceList.size(); i++) {
            String exper = experienceList.get(i).getFistName() +" "+ experienceList.get(i).getLastName();
            System.out.println(exper);
        }
    }

    @Override
    public void search() {
        System.out.print("Enter the name you want see the information: ");
        String strExperience = scanner.nextLine();
        for (int i = 0; i < experienceList.size(); i++) {
            if ( experienceList.get(i).getFistName().contains(strExperience)  || experienceList.get(i).getLastName().contains(strExperience)) {
                System.out.print(experienceList.get(i).getFistName() + " " + experienceList.get(i).getLastName() + " || ");
                System.out.print(experienceList.get(i).getBirthDate() + " || ");
                System.out.print(experienceList.get(i).getAddress() + " || " );
                System.out.print(experienceList.get(i).getPhoneNumber() + " || ");
                System.out.print(experienceList.get(i).getEmail() + " || ");
                System.out.println(experienceList.get(i).exp);
            }
        }
    }
}
