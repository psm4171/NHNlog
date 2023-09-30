package Exercises;

public class Main2 {
    private int x = 101;
    private void f(int x){
        x++;
        g();
    }

    private void g(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Main2 m2 = new Main2();
        int x = 200;
        m2.f(x);
    }
}
