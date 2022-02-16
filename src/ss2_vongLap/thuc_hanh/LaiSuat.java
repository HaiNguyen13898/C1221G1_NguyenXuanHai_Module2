package ss2_vongLap.thuc_hanh;

import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        double money;
        int month ;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: "); // Nhập số tiền
        money = input.nextDouble();
        System.out.println("Enter number of months: "); // Nhập số tháng
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: "); // Nhập lãi suất hàng năm
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
