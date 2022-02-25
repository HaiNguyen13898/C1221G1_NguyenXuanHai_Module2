package ss7_abstract_class_interface.bai_tap.interface_resizeable;



public class Square extends Shape  implements Resizeable {
    private double side;

    public Square() {
    }


    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea () {
        return this.getSide() * this.getSide();
    }

    @Override
    public String toString() {
        return "A Square with side: " +
                getSide() +
                ", which is a area" +
                getArea();
    }

    @Override
    public void resize(double percent) {
         setSide(getSide() * percent + getSide());
    }
}
