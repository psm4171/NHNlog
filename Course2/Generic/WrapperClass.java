import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num1 = new Integer(42);
        Integer num2 = 15;

        int sum = num1 + num2;
        System.out.println("Sum : " + sum);

        List<Integer> num = new ArrayList<>();
        num.add(num1);
        num.add(num2);

        System.out.println("Iterator : ");
        Iterator <Integer> iterator = num.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            System.out.println(element);
        }

        System.out.println("val1, val2 : ");
        int val = num1.intValue();
        System.out.println(val);

        int val2 = num2.intValue();
        System.out.println(val2);
    }
}
