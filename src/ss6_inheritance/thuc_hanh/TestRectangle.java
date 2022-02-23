package ss6_inheritance.thuc_hanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("Black", false, 6, 7);
        System.out.println(rectangle2);
    }
}
