package BoxSortEx;

import java.util.Collections;

public class BoxMain2 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 200));
        appleBox.add(new Apple("GreenApple", 250));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        System.out.println("내림차순 정렬");
        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println("오름차순 정렬");
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}
