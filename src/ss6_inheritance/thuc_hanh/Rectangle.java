package ss6_inheritance.thuc_hanh;

public class Rectangle extends Shape {
    double width;
    double length = 1.0;

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
        return "A Rectangle with width " +
                 getWidth() +
                " and length " +
                getLength() +
                " which is a subclass of" +
                super.toString();
    }
}
