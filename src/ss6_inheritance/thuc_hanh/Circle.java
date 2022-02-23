package ss6_inheritance.thuc_hanh;

public class Circle extends Shape {
    double radius = 1.0;

    public Circle () {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter () {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius" +
                 radius +
                "which is a subclass of " +
                super.toString();
    }
}
