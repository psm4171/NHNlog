package Exercises;

import java.util.Scanner;

public class Main4 {

    public static int GCD(int a, int b){
        if(b == 0) return a;
        else return GCD(b, a % b);
    }

    public static boolean Prime(int a, int b){
        if(a == 1 || b == 1) return true;
        else if ((a != 1 || b != 1) && (a == b)) return false;
        else if ((a != 1 || b != 1) && (a < b)) return Prime(a, b - a);
        else return Prime(a - b, b);
    }

    public static int rest(int a, int b){
        if(a < 0) return rest(a + b, b);
        else if(0 <= a || a < b) return a;
        else return rest(a - b, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요 : ");
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("GCD : " + GCD(x, y));
        System.out.println("Prime : " + Prime(x, y));
        System.out.println("Rest : " + rest(x, y));
    }
}
