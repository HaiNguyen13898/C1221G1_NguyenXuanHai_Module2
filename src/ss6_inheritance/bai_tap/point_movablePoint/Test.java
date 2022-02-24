package ss6_inheritance.bai_tap.point_movablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();

        point.setX(0);
        point.setY(3);
        System.out.println("Point : " + point);

        point.setXY(0, 4);
        System.out.println("Point : " + point);

        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setxSpeed(3);
        movablePoint.setySpeed(2);


        movablePoint.move();

        System.out.println(movablePoint);
    }
}
