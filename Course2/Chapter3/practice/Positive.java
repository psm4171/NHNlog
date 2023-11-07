package min.chapter3.practice;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Positive {
    public static void main(String[] args) {

        int positiveNum;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        positiveNum = sc.nextInt();

        while(positiveNum <= 0){
            System.out.println("순서의 시작은 양수입니다. 다시 입력하세요. ");
            positiveNum = sc.nextInt();
        }

        while(positiveNum != 1){
            if(positiveNum % 2 == 0){
                positiveNum = positiveNum / 2;
            }
            else {
                positiveNum = 3 * positiveNum + 1;
            }

            System.out.println("positiveNum : " + positiveNum);
            count++;
        }

        System.out.println("Count : " + count);

    }
}
