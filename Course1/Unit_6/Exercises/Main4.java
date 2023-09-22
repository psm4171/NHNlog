package Exercises;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("반복할 횟수를 입력하세요. ");
        int it = sc.nextInt();

        int positiveSum = 0;
        int negativeSum = 0;

        System.out.println(it + "번 더할 수를 지정하세요. ");

        int num = 0;

        for(int i = 1; i <= it; i++){

            num = sc.nextInt();
            if(num > 0){
                positiveSum += num;
            }
            else {
                negativeSum += num;
            }
        }

        if(num > 0) {
            System.out.println("양수를 더한 값은 " + positiveSum);
        }
        else {
            System.out.println("음수를 더한 값은 " + negativeSum);
        }

    }
}

