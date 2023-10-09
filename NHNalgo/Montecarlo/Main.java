
public class Main {

    public static double montecarlo(double x, double y) {
        int count = 0;
        double result = 0;

            for (int i = 1; i <= 1000000; i++) {
                x = Math.random();
                y = Math.random();

                if (x * x + y * y <= 1) {
                    count++;
                }
                if(i % 200000 == 0) {
                    System.out.printf("%.4f\n", (double) (count * 4) / i);
                    result = count * 4.0 / i;
                }
            }
        return result;

    }
    public static void main(String[] args) throws Exception {
        double x = 0;
        double y = 0;
        double monte = montecarlo(x, y);
        System.out.printf("몬테카를로 값 : %.4f\n", monte);

    }
}
