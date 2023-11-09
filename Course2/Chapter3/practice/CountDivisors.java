package min.chapter3.practice;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {
        int N;
        int divisorCount;
        int numberTested;
        int testDivisor;

        while(true) {
            System.out.println("Enter a positive integer : ");
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            if (N > 0)
                break;
            System.out.println("Not a positive Number!");
        }

            divisorCount = 0;
            numberTested = 0;

            for(testDivisor = 1; testDivisor <= N; testDivisor++) {
                if (N % testDivisor == 0) {
                    divisorCount++;
                }
                numberTested++;
                if (numberTested == 10000000) {
                    System.out.print('.');
                    numberTested = 0;
                }
            }

        System.out.println("The number of divisors of " + N + " is " + divisorCount);

        }

    }

