package ss6_inheritance.bai_tap.point2d_point3d;

public class Point3d  extends  Point2d{
    float z = 0.0f;

    public Point3d () {

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ (float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public float [] getXYZ () {
        float [] array = {this.x, this.y, this.z};
        return  array;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                "} " + super.toString();
    }
}
