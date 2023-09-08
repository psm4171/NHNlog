import java.util.Comparator;

public class Student implements Comparable <Student> {
    private int studentNo;
    private String name;
    private int age;

//    Comparator <Student> comparator = new Comparator<Student>() {
//        @Override
//        public int compareTo(Student s1, Student s2) {
//            return s2.getAge() - s1.getAge();
//        }
//    };

    public Student(int studentNo, String name, int age){
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
    }

    public int getStudentNo(){
        return this.studentNo;
    }


    public int getAge(){
        return this.age;
    }

    // @Override
    public String toString(){
        return this.studentNo + ", " + this.name + ", " + this.age;
    }


    @Override
    public int compareTo(Student o) {
         return o.getStudentNo() - getStudentNo();

    }

}