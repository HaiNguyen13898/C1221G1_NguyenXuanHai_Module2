package ss4_class_object.bai_tap.class_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setSpeed(3);

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setSpeed(0);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
