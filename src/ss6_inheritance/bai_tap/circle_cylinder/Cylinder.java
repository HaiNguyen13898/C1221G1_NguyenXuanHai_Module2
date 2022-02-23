package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    double height = 7;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume (){
        return Math.PI * getHeight() * Math.pow(super.getR(), 2);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", height=" + height +
                "} " + super.toString();
    }
}
