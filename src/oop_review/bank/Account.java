package oop_review.bank;

import java.util.Scanner;

public class Account {
    private long numberAccount;
    private String nameAccount;
    private double moneyInBank = 50;

    Scanner scanner = new Scanner(System.in);

    public Account() {
    }

    public Account(long numberAccount, String nameAccount, double moneyInBank) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.moneyInBank = moneyInBank;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getMoneyInBank() {
        return moneyInBank;
    }

    public void setMoneyInBank(double moneyInBank) {
        this.moneyInBank = moneyInBank;
    }

    public double putMoney() {
        double put;
        System.out.println("Nhập số tiền bạn cần nạp vào tài khoản (nạp 50k thôi!! nạp nhiều bị cướp) ");
        put = scanner.nextDouble();
        if (put > 0) {
            moneyInBank += put;
            System.out.println("Bạn vừa nộp " + put + " vào tài khoản");
            System.out.println("Số tiền trong tài khoản hiện tại của bạn: " + moneyInBank);
        } else {
            System.out.println("Đồ nghèo");
        }
        return put;
    }

    public double takeMoney() {
        double phiRutTien = 12;
        double rutTien;
        System.out.println("Nhập số tiền bạn cần rút (Không có tiền thì đừng rút)");
        rutTien = scanner.nextDouble();
        if (rutTien <= (moneyInBank + phiRutTien)) {
            moneyInBank = moneyInBank -  (phiRutTien + rutTien);
            System.out.println("Bạn vừa rút " + rutTien + " trong tài khoản của bạn");
            System.out.println("Số dư tài khoản còn lại của bạn: " + moneyInBank);
        } else {
            System.out.println("Đã bảo là không có tiền mà còn bày đặt đi rút tiền");
        }
        return rutTien;
    }

    public double expire() {
        double interestRate = 0.035;
        moneyInBank += moneyInBank * interestRate;
        System.out.println("Tài khoản của bạn đã tự động đáo hạn");
        System.out.println("Số dư hiện tại của bạn: " + moneyInBank);
        return moneyInBank;
    }



    @Override
    public String toString() {
        return "Account {" +
                "numberAccount=" + numberAccount +
                ", nameAccount='" + nameAccount + '\'' +
                ", money=" + moneyInBank +
                '}';
    }
}
