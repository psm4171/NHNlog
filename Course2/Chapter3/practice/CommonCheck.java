package min.chapter3.practice;

import java.util.Scanner;

public class CommonCheck {
    public static void main(String[] args) {
        boolean commonCheck = false; // 공통 문자가 없다고 가정
        int i, j;

        System.out.println("두 문자가 동일하면 true, 다르면 false");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        i = 0;
        while(i < s1.length()){
            j = 0;
            while(j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    commonCheck = true;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println(commonCheck);
    }
}
