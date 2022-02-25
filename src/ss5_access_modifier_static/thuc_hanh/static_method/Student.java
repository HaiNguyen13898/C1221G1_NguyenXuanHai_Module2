package ss5_access_modifier_static.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


     Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
