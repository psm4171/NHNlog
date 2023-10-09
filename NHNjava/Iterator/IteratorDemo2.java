import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("While문 지나기 전 리스트에 존재하는 값 : " + list);

        ListIterator <String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Object element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("수정된 결과 : " + list);

        System.out.print("역순으로 출력 : ");
        while(listIterator.hasPrevious()){
            Object element = listIterator.previous();
            System.out.print(element + " ");
        }

    }
}
