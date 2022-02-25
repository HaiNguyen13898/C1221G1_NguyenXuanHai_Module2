package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length = 1.0;

    public  Rectangle () {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea () {
        return getWidth() * getLength();
    }
     public double getPerimeter () {
        return (getLength() + getWidth()) * 2;
     }

    @Override
    public String toString() {
        return "A Rectangle with width: " +
                 getWidth() +
                " and length: " +
                getLength() +
                ", which is a area" +
                getArea();
    }


    @Override
    public void resize(double percent) {
       setWidth( getWidth() * percent + getWidth());
       setLength(getLength() * percent + getLength());
    }
}
