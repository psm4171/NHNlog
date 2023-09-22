package Exercises;

import java.util.Scanner;

public class Main11 {
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

        if(primeCheck(number)){
            System.out.println(number +" 은(는) 소수입니다.");
        }
        else
            System.out.println(number +" 은(는) 소수가 아닙니다.");


    }
}
