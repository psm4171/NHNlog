import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Student st = new Student();
        // Student st = new Student(20182177,"psm", "computer", 26);
        Department<Student> department = new Department<>(1, "컴퓨터공학과");

        department.add(new Student(2, "psm", 26));
        department.add(new Student(43, "james", 28));
        department.add(new Student(1, "paset", 22));

        printStudents(department);

        Collections.sort(department.getList());

        System.out.println("학번이 빠른 순으로 정렬합니다. ");

        Collections.sort(department.getList(), (Student s1, Student s2) -> s1.getStudentNo() - s2.getStudentNo());

        printStudents(department);

        System.out.println("나이가 높은 순으로 정렬합니다. ");

//         1. comparator의 서브 타입 클래스로 인스턴스 선언
//       Collections.sort(department.getList(), new AgeOrder());

//        2. 익명 클래스
//        Comparator <Student> ageOrder = new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s2.getAge() - s1.getAge();
//            }
//        };

//         3. 람다식 표현
        Collections.sort(department.getList(), (Student s1, Student s2) -> s2.getAge() - s1.getAge());

        printStudents(department);

//            제네릭 타입 extends <E extends Student> 으로 선언하여 sort() 실행한 결과
        System.out.println("<E extends Student>으로 선언하여 sort() 실행한 결과입니다. ");
        department.sort();

        printStudents(department);


    }

    // public static void printStudentInfo(Student st){ }

    public static void printStudents(Department<Student> department) {
        for(Student s : department){
            System.out.println(s);
        }
    }

}

