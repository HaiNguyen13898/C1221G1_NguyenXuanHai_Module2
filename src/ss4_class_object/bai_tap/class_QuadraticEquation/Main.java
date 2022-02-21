package ss4_class_object.bai_tap.class_QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap gia tri b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap gia tri c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.toString());

        if (quadraticEquation.getDiscriminant() >= 0  ){
            System.out.println("Nghiệm 1 của phương trình là " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2 của phương trình là " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0 ){
            System.out.println("Nghiệm của phương trình là " + quadraticEquation.getRoot1() );
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
