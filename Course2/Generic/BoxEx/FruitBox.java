package BoxEx;


public class FruitBox<T extends  Fruit & Eatable> extends Box<T> {
    // FruitBox는 Fruit의 자손이면서 Eatable을 구현한 클래스만 타입 매개변수 T에 대입될 수 있다.
}
