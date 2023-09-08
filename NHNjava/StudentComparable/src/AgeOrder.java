import java.util.Comparator;

public class AgeOrder implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s2.getAge() - s1.getAge();
    }
}
