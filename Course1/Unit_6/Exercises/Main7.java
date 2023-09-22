package Exercises;

import java.util.Scanner;

public class Main7 {

    public static int findingSequence(String str){

        int cCnt = 0;
        int maxIdx = -1;

        for(int i = 0; i < str.length(); i++){
             char currentChar = str.charAt(i);

            if(currentChar == 'c'){
                cCnt++;
                if(cCnt > maxIdx){
                    maxIdx = cCnt;
                }
            }
            else {
                cCnt = 0;
            }
        }
        return maxIdx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. ");
        String s = sc.nextLine();

        int sequence = findingSequence(s);
        System.out.println(sequence);

    }
}
