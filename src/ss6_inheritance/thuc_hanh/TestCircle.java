package ss6_inheritance.thuc_hanh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);


        Circle circle1 = new Circle("red", true, 1.5);
        System.out.println(circle1);
    }
}
