package Exercises;

import java.util.Scanner;

public class Main13 {
    public static boolean primeCheck(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("소수 판별할 숫자를 입력하세요. ");
        int number = sc.nextInt();


        if(primeCheck(number)) {
            System.out.println(number + " 은(는) 소수입니다.");
            System.out.println("처음부터 출력할 소수를 정합니다. ");
            int checkNum = sc.nextInt();
            int cnt = 0;
            int num = 2;

            while (cnt < checkNum) {
                if (primeCheck(num)) {
                    System.out.print(num + " ");
                    cnt++;
                }
                num++;
            }

        }
        else
            System.out.println(number +" 은(는) 소수가 아닙니다.");

    }
}
