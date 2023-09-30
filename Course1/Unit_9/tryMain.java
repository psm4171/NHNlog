public class tryMain {
    // 에러는 없고, instance variable x가 실행됐다.
    private int x = 101;

    private void f(int x) {
        this.x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        tryMain e = new tryMain();
        int x = 200;
        e.f(x);
    }
}
