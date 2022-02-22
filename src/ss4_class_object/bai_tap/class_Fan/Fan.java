package ss4_class_object.bai_tap.class_Fan;

public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

//    public Fan(int speed, boolean on, double radius, String color) {
//        this.speed = speed;
//        this.on = on;
//        this.radius = radius;
//        this.color = color;
//    }


    public int getSpeed(int i) {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (!this.isOn()) {
            return "Fan is on, " +
                    "speed " + this.speed + ", " +
                    "Color is" + this.color + ", " +
                    "Radius is " + this.radius;

        } else  {
            return "Fan is off, " +
                    "color " + this.color + ", " +
                    "radius " + this.radius ;
        }
    }
}
