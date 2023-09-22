package Exercises;

import java.util.Scanner;

public class Main6 {

    public static String decoded(String str, int d){
        String decoding = "";
        char c;
        for(int i = 0; i <str.length(); i++){
            c = (char)((int) str.charAt(i) - d);
            decoding = decoding + c;
        }

        return decoding;

    }
    public static void main(String[] args) {
        String str = "NHN Study Team 10";

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        String decodedStr = decoded(str, d);

        System.out.println(decodedStr);

    }
}
