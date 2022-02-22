package ss2_vongLap.bai_tap;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: \n" +
                "1 Hình chữ nhật \n" +
                "2 Hình tam giác vuông, botton-left\n" +
                "3 Hình tam giác vuông, top-left \n" +
                "4 Hình tam giác vuông cân\n" +
                "5 Hình tam giác vuông, top-right\n" +
                "6 Hình tam giác vuông, botton-right\n");
        System.out.println("Choose:");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                for (int a = 0; a < 3; a++) {
                    for (int b = 0; b < 10; b++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            }
            case 2: {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("*");
                }
                break;
            }
            case 3: {
                for (int i = 6; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            }
            case 4: {
                for (int i = 1; i < 6; i++) {
                    for (int j = 6; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int q = 1; q <= i * 2 - 1; q++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            }
            case 5: {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (j <= i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            }
            case 6: {
                for (int i = 5; i >= 0; i--) {
                    for (int j = 0; j < 6; j++) {
                        if (j <= i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            }
        }

    }
}
