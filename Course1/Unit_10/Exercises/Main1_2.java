package Exercises;

import java.util.Scanner;

public class Main1_2 {

    public static int cnt = 0;

    public static int fibo_iter(int n){

        int prev = 1;
        int current = 0;
        int result = 0;
        if(n <= 0) return 0;
        else if (n == 1) return 1;
        else {
            for(int i = 2; i <= n; i++){
                result = prev + current;
                current = prev;
                prev = result;
            }
        }
        return result;
    }

    public static int fibo_recursion(int n){
        if(n == 0) return 0;
        else if (n == 1) return 1;
        else {
            cnt++;
            return fibo_recursion(n-1) + fibo_recursion(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("반복문을 사용한 피보나치 수열");
        System.out.println(fibo_iter(n));

        System.out.println("재귀를 사용한 피보나치 수열");
        System.out.println(fibo_recursion(n));

        System.out.println("재귀 호출한 총 횟수 : " + cnt);
    }
}
