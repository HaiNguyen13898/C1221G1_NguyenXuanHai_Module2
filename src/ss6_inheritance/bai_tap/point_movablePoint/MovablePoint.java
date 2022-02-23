package ss6_inheritance.bai_tap.point_movablePoint;

public class MovablePoint extends Point {
   private float xSpeed;
   private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed (float xSpeed, float ySpeed ) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed () {
        float [] arr = {xSpeed, ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} " + super.toString();
    }
    public MovablePoint move () {
        super.setX(this.getX() + this.getxSpeed());
        super.setY(this.getY() + this.getySpeed());
        return  this;
    }

}
