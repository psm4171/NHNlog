public class Divisor {
    public static void main(String[] args) {
        int dividend, divisor, result, rest;
        // dividend와 divisor에 원하는 값 할당
        dividend = 21;
        divisor = 4;
        result = 0;
        rest = dividend;

        while (rest >= divisor) {
            rest = rest - divisor;
            result++;
        }

        System.out.println("result = " + result);
        System.out.println("rest = " + rest);
    }
}
