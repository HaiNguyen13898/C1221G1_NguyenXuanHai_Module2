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
        setXY(x, y);
        this.z = z;
    }

    public float [] getXYZ () {
        float [] array = {3};
        array[0]=this.z;
        array[1]=this.z;
        array[2]=this.z;
        return  array;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
