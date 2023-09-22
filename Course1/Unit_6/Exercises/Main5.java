
package Exercises;

import java.util.Scanner;

public class Main5 {

        public static double returnPi(int n){
            double pi = 0.0;
            boolean operatorCheck = true; // 첫 번째 항

            for (int i = 0; i < n; i++) {
                int denominator = 2 * i + 1;

                if (operatorCheck) {
                    pi += 4.0 / denominator;
                } else {
                    pi -= 4.0 / denominator;
                }

                operatorCheck = !operatorCheck;
            }

            return pi;
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("항의 갯수를 입력합니다. ");
        int n = sc.nextInt();
        double returnPi = returnPi(n);
        System.out.println(n + "번, " + returnPi);

    }
}
