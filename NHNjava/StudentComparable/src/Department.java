import java.util.*;
// <E> 타입으로 걸려있을 때, student와 교수--> 상위 클래스로 , 멤버가 comparable이면 가능
public class Department<E extends Student> implements Iterable <E>{
    private int departmentNo;
    private String departmentName;

    private List <E> list = new ArrayList<E>();


    public Department(int no, String departName){
        this.departmentNo = no;
        this.departmentName = departName;
    }

//    public void add(Student s){
//        list.add(s);
//    }

    public void add (E e){
        list.add(e);
    }

    public String getName(){
        return this.departmentName;
    }

    public int getDepartmentNo(){
        return this.departmentNo;
    }

    public Iterator<E> iterator(){
        return this.list.iterator();
    }

    public List<E> getList(){
        return this.list;
    }


    public void sort(){
        Collections.sort(this.list); // 타입이 <E> 로 걸려있어서 오류 발생
    }

    public void sort(Comparator<E> compare){
        Collections.sort(this.list, compare);
    }



}
