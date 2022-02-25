package ss7_abstract_class_interface.bai_tap.interface_resizeable;

import ss6_inheritance.thuc_hanh.Rectangle;

public class Square extends Rectangle implements Resizeable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side ) {
        super( color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                ;
    }


    @Override
    public double resize(double percent) {
        return percent * super.getArea() + this.getArea() ;
    }
}
