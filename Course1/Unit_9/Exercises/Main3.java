package Exercises;

public class Main3 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo()); // Base
        System.out.println(d.getInfo()); // infod를 출력하고, 상속하는 Base의 infob를 출력
        d = b;
        System.out.println(b.getInfo());
    }
}
