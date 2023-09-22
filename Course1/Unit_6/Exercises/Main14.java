package Exercises;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 n을 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "의 소인수를 출력합니다. ");

        int i = 2;

        while (true) {
            if(n == 1)
                break;
            if(n % i == 0) {
                n /= i;
                System.out.println(i);
            }
            else {
                i++;
            }
        }

    }
}
