package ss2_vongLap.bai_tap;

public class VeHinh {
        public static void main(String[] args) {
        for (int a = 0; a < 3; a++) {
            for ( int b = 0; b < 10; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            for (int j = 0 ; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

        System.out.println("\n");

            for (int i = 6; i >=0 ; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
