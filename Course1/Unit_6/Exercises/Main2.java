package Exercises;

import java.util.Scanner;

public class Main2 {

    public static void evenPrint(int n){

        int even = 2;
        for(int i = 1;  i <= n; i++){
                even +=2;
                System.out.println(even);

        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("출력할 n개의 짝수 ");
        int n = sc.nextInt();

        evenPrint(n);

    }
}
