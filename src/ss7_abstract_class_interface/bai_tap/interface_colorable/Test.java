package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Test {

    public static void main(String[] args) {
        Colorable[] shape = new Colorable[3];
        shape[0] = new Circle(2, "none", false);
        shape[1] = new Rectangle(2, 3, "none", true);
        shape[2] = new Square("Black", false, 3);

        for (Colorable show : shape) {
            if (show instanceof Square) {
                show.howToColor();
            }
            System.out.println(show);
        }
    }
}
