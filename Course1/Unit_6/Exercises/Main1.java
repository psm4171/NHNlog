package Exercises;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if(num < min) {
                min = num;
            }
        }
        System.out.println(min);
        sc.close();
    }
}
