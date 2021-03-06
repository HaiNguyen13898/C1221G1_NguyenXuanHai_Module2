package ss4_class_object.thuc_hanh;

public class Rectangle {
    double width;
    double height;

    public Rectangle (){
    }

    public Rectangle ( double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea () {
        return this.width * this.height;
    }

    public double getPerimeter () {
        return (width + height) * 2;
    }

    public String display () {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}
