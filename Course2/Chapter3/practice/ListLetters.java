package min.chapter3.practice;

import java.util.Scanner;

public class ListLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        char text = 0;
        inputStr = inputStr.toUpperCase();

        int count = 0;

        for(text = 'A'; text <= 'Z'; text++) {
            for (int i = 0; i < inputStr.length(); i++) {
                if (text == inputStr.charAt(i)) {
                    System.out.print(text);
                    System.out.print(' ');
                    count++;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("다른 문자들이 " + count + "개 존재합니다. ");

    }
}
