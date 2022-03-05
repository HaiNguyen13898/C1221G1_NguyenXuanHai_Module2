package candidates.controller;

import candidates.services.ExperienceController;
import candidates.services.FresherController;
import candidates.services.IntermController;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public void displayMenu() {

        int choose, choose1, choose2;
        boolean flag = true;
        String yes = "yes";


        Scanner scanner = new Scanner(System.in);
        ExperienceController experienceS = new ExperienceController();
        FresherController fresherS = new FresherController();
        IntermController intermS = new IntermController();
        do {
            System.out.println("---------Menu for you-------");
            System.out.print("1.Experience\n" +
                    "2.Fresher\n" +
                    "3.Intern\n" +
                    "4.Searching\n" +
                    "5.Exit\n" +
                    "Enter your choice: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    experienceS.add();
                    break;
                case 2:
                    fresherS.add();
                    break;
                case 3:
                    intermS.add();
                    break;
                case 4:
                    System.out.println("-----Menu 2-----");
                    System.out.print("1.EXPERIENCE CANDIDATE\n" +
                            "2.FRESHER CANDIDATE\n" +
                            "3.INTERN CANDIDATE\n" +
                            "6.Enter your choice: ");
                    choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1){
                        case 1:
                            experienceS.display() ;
                            System.out.print("Do you want to see more information fromm list?\n"+
                                    "Yes\n"+
                                    "No\n"+
                                    "Enter your choice: ");
                            String choice1 = scanner.nextLine();
                            if(choice1.toLowerCase(Locale.ROOT).contains(yes)){
                                experienceS.search();
                            } else {
                                System.out.print("Bye, hope u have girl fr");
                            }
                            break;
                        case 2:
                            fresherS.display();
                            System.out.print("Do you want to see more information fromm list?\n"+
                                    "Yes\n"+
                                    "No\n"+
                                    "Enter your choice: ");
                            String choice2 = scanner.nextLine();
                            if(choice2.toLowerCase(Locale.ROOT).contains(yes)){
                                fresherS.search();
                            } else {
                                System.out.print("Bye, hope u have girl fr");
                            }
                            break;
                        case 3:
                            intermS.display();
                            System.out.print("Do you want to see more information fromm list?\n"+
                                    "Yes\n"+
                                    "No\n"+
                                    "Enter your choice: ");
                            String choice3 = scanner.nextLine();
                            if(choice3.toLowerCase(Locale.ROOT).contains(yes)){
                                intermS.search();
                            } else {
                                System.out.print("Bye, hope u have girl fr");
                            }
                            break;
                    }
                    break;

                default:
                    System.out.println("You better go away, you little shit!!!");
                    flag = false;
                    break;
            }

        } while (flag);
    }
}