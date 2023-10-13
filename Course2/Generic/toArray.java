import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

public class toArray {
    public static void main(String[] args) {
        // 문자열 컬렉션을 만들고
        Collection <String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Grape");

        Object[] objectArray = collection.toArray(); //toArray()로 Object[] 배열로 변환하여 출력
        for(Object item : objectArray){
            System.out.println(item);
        }

        System.out.println("Iterator를 사용한 출력 ");
       Iterator <String> iterator = collection.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
            if(item == null){
                iterator.remove();
            }

        }

    }

}
