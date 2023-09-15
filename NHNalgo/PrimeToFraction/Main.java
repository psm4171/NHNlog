import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class Fraction {
        private int numerator;  // 분자
        private int denominator;    // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public String toString() {

            if (denominator < 0) {
                Math.abs(denominator);

            }

                return (numerator) + "/" + denominator;

            }


        public void normalize() {

            int gcd = gcd(numerator, denominator);
            numerator/=gcd; // 분자
            denominator/=gcd; // 분모

        }

    }

    /**
     * 소수점 값에 대해 자리 수 계산 하는 메서드.    <br/>
     * ex)  <br/>
     * 0.01 -> 100을 곱하기 위해 2를 return    <br/>
     * 0.1 -> 10을 곱하기 위해 1을 return
     *
     *
     * @param num   소수 값
     * @return      소수점 이하 자리 수 값
     */

    // {"0", "25"}
    public static int getDecimalNumber(BigDecimal num) {
        String str = num.toPlainString(); // 소수
        String[] str2 = str.split("\\.");

        int find = str2[1].length();

//        System.out.println(Arrays.toString(str2));
//        System.out.println(find);

        return find;
    }

    public static String solution(String input) {
        BigDecimal number = new BigDecimal(input);

        int decimalNumber = getDecimalNumber(number); // 소수

        int numerator = (int) (number.doubleValue() * (Math.pow(10, decimalNumber)));
        double denominator=  Math.pow(10, decimalNumber); // 분모


        return new Fraction(numerator, (int) denominator).toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("0.1"));
        System.out.println(solution("-0.5"));
        System.out.println(solution("0.25"));

    }

    private static int gcd(int first, int second){
        if(second == 0)
            return first;
        else
            return gcd(second, first % second);
    }



}