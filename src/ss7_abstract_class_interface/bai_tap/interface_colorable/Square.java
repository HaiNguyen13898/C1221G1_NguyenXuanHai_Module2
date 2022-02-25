package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable  {

    private double side;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea () {
        return  this.getSide() * this.getSide();
    }

    @Override
    public String toString() {
        return "Square {" +
                "side=" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Sơn hết, sơn tất cả 4 cạnh nào, sơn mạnh tay vào");
    }
}
