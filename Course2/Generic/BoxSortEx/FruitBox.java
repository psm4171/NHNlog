package BoxSortEx;

import java.util.Comparator;
import java.util.List;

public class FruitBox<T extends Fruit> extends Box<T> {
    // FruitBox는 Fruit의 자손이면서 Eatable을 구현한 클래스만 타입 매개변수 T에 대입될 수 있다.

    public static <T extends Comparator<? extends T>> void sort(List<T> list){

    }
}
