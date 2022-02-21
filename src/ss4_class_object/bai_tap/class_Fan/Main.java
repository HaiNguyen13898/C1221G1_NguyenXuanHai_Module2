package ss4_class_object.bai_tap.class_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan( 0,false, 2.5, "red" );
        Fan fan2 = new Fan( 2,true, 5, "black" );
        System.out.println(fan.toString());
        System.out.println(fan2.toString());
    }
}
