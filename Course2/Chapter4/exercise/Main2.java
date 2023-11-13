package min.chapter4.practice.exercise;

import java.util.Scanner;

public class Main2 {

    public static int hexValue(char text){
        int hexValue = 0;

        switch (text) {
            case '1':
                hexValue = 1;
                break;
            case '2':
                hexValue = 2;
                break;
            case '3':
                hexValue = 3;
                break;
            case '4':
                hexValue = 4;
                break;
            case '5':
                hexValue = 5;
                break;
            case '6':
                hexValue = 6;
                break;
            case '7':
                hexValue = 7;
                break;
            case '8':
                hexValue = 8;
                break;
            case '9':
                hexValue = 9;
                break;
            case 'a':
                hexValue = 10;
                break;
            case 'b':
                hexValue = 11;
                break;
            case 'c':
                hexValue = 12;
                break;
            case 'd':
                hexValue = 13;
                break;
            case 'e':
                hexValue = 14;
                break;
            case 'f':
                hexValue = 15;
                break;
        }

        if(hexValue == -1){
            throw new IllegalArgumentException("Invalid input");
        }else {
            return hexValue;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int value = 0;
        for(int i = 0; i < text.length(); i++){
            value = value * 16 + hexValue(text.charAt(i));
        }

        System.out.println(value);

    }

}
