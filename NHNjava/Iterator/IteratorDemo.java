import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {


    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("Psm");
        arrayList.add("ArrayList");

        System.out.println("Ierate Using Iterator");

        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
