package ss10_dsa.bai_tap;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Hai");
        Student student2 = new Student(2, "Hien");
        Student student3 = new Student(3, "Ha");
        Student student4 = new Student(4, "Tung");
        Student student5 = new Student(5, "Huong");
        Student student6 = new Student(6, "Phong");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newStudentMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(student);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
//      studentMyArrayList.add(student6, 3); thêm phần tử student 6 vào vị trí thứ 3
//      studentMyArrayList.clear();
        System.out.println(studentMyArrayList.size());
//      System.out.println(studentMyArrayList.get(4).getName()); Lấy get() phần tử ở vị trí thứ 4 + tên getName()
//      System.out.println(studentMyArrayList.indexOf(student3)); kiểm tra vị trí phần tử student3
//      System.out.println(studentMyArrayList.contains(student3)); kiểm tra xem phần tử student 3 có trong mảng không


//        for (int i = 0; i < studentMyArrayList.size() ; i++) {
//            Student students = (Student) studentMyArrayList.elements[i];
//            System.out.println(students.getId());
//            System.out.println(students.getName());
//        }

        newStudentMyArrayList.clone();
        newStudentMyArrayList.remove(2);
//      for (int i = 0; i < studentMyArrayList.size() ; i++) {
//            Student students = (Student) studentMyArrayList.elements[i];
//            System.out.println(students.getId());
//            System.out.println(students.getName());
//        }

    }


}
