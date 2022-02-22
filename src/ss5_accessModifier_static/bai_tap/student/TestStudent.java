package ss5_accessModifier_static.bai_tap.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Hai");
        student1.setClasses("C12");
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);
    }
}
