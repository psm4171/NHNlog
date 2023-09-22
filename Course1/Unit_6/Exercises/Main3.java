package Exercises;

import java.util.Scanner;

public class Main3 {

    public static int factorial(int n){

        if(n < 0){
            System.out.println("양의 정수로 다시 입력하세요, ");
        }
        else {
            if(n == 0) return 1;
            else if(n == 1) return 1;
            else {
               return n * factorial(n - 1);
            }
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
