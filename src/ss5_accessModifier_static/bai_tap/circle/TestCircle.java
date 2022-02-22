package ss5_accessModifier_static.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(2);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }

}
