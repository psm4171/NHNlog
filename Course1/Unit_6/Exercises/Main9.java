package Exercises;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력한 수(높이)만큼 피라미드를 생성합니다. ");
        int height = sc.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int i = 0; i < height - row; i++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }

            for (int k = row - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
