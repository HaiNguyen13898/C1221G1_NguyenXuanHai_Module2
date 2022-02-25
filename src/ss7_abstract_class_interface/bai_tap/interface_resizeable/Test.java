package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Resizeable [] shapes = new Resizeable[3];
        shapes[0] = new Circle("red", true, 4);
        shapes[1] = new Rectangle("yellow", false, 6.2, 9);
        shapes[2] = new Square("Black", true, 5);


        shapes[0].resize(Math.random()*100);
        shapes[1].resize(Math.random()*100);
        shapes[2].resize(Math.random()*100);
        for (Resizeable a : shapes){
            System.out.println(a);
        }





    }
}
