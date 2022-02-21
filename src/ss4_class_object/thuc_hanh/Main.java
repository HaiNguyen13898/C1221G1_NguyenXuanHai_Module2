package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter hieght: ");
        double hieght = scanner.nextDouble();

        Rectangle rectangle = new Rectangle( width, hieght);

        System.out.println( rectangle.display());

        System.out.println("Diện tích hình chữ nhật " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật " + rectangle.getPerimeter());

    }
}
