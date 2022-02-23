package demo.student;

public class ManagerStudent {

    private static Student[] students = new Student[50];
    static {
        students [0] = new Student(1, "Hai", "1998", "C12", "ĐHKT" );
        students [1] = new Student(2, "Trinh", "1998", "C12", "BK" );
        students [2] = new Student(3, "Phuong", "1998", "C12", "NN" );
        students [3] = new Student(4, "Hien", "1998", "C12", "SP" );
    }

    public void showListStudent () {
        Student.school = "BK";
        for ( Student student : students ){
            if (student != null){
                System.out.println(student);
            } else {
                break;
            }
        }
    }
}
