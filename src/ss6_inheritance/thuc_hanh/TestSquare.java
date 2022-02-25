package ss6_inheritance.thuc_hanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println(square);
        System.out.println("Diện tích: " + square.getArea());

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red", true, 5);
        System.out.println(square);
    }
}
