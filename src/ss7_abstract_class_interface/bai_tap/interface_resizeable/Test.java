package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println( "Diện tích của hình tròn ban đầu " + circle.getArea());
        System.out.println("Diện tích của hình tròn khi tăng 2% là " + circle.resize(0.02));

        System.out.println("\n");

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Diện tích của hình chữ nhật ban đầu " + rectangle.getArea());
        System.out.println("Diện tích của hình chữ nhật sau khi tăng 3% là " +rectangle.resize(0.03));

        System.out.println("\n");

        Square square = new Square(3);
        System.out.println("Diện tích hình vuông lúc ban đầu " + square.getArea());
        System.out.println("Diện tích sau khi tăng lên 5% " + square.resize(0.05));


    }
}
