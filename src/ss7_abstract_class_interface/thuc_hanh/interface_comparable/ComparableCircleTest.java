package ss7_abstract_class_interface.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
//        ComparableCircle[] comparableCircles = new ComparableCircle[3];
//        comparableCircles[0] = new ComparableCircle(4.7);
//        comparableCircles[1] = new ComparableCircle("red", true, 6);
//        comparableCircles[3] = new ComparableCircle();
//
//        System.out.println("Pre-sorted:");
//        for (ComparableCircle circle : comparableCircles) {
//            System.out.println(circle);
//        }
//        Arrays.sort(comparableCircles);
//
//        System.out.println("After-sorted:");
//        for (ComparableCircle circle : comparableCircles) {
//            System.out.println(circle);
//        }

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("Black", true, 4);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
