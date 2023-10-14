package BoxEx;

public class BoxMain {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();
        Box<Toy> toyBox = new Box<Toy>();

        FruitBox<Fruit> fruitFruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleFruitBox = new FruitBox<Apple>();
        FruitBox<Orange> orangeFruitBox = new FruitBox<Orange>();

        // Box
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.add(new Orange());

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(orangeBox);
        System.out.println(toyBox);

        System.out.println("fruitFruitBox 출력");

        fruitFruitBox.add(new Fruit());
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Orange());
        fruitFruitBox.add(new Toy()); // Toy는 들어가지 않는다.

        appleFruitBox.add(new Apple());
        orangeFruitBox.add(new Orange());

        System.out.println(fruitBox);
        System.out.println(appleFruitBox);
        System.out.println(orangeFruitBox);


    }
}
