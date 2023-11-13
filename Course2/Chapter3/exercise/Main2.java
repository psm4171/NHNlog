package min.chapter3.exercise;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int max = 0;
        int n;
        int divisorCount = 0;
        int numWithMax = 1;
        int testedNumber;


            for(n = 2; n <= 10000; n++) {
                    divisorCount = 0;
                for (testedNumber = 1; testedNumber <= n; testedNumber++) {

                    if (n % testedNumber == 0) {
                        divisorCount++;
                    }
                    if (divisorCount > max) {
                        max = divisorCount;
                        numWithMax = n;

                    }
                }
            }

        System.out.println(max);
        System.out.println(divisorCount);
        System.out.println(numWithMax);

    }
}
