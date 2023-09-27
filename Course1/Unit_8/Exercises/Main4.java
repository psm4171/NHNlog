package Exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main4 {

    public static void multiTable(String fileName, int n) throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter(fileName));
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 9; j++){
                int mul = i * j;
                wr.write(String.format("%d\t", mul));
            }
            wr.newLine();
        }
        wr.flush();
    }
    public static void main(String[] args) throws IOException {
        String fileName = "Exercises/Main4_Multi.txt";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiTable(fileName, n);
        System.out.println( n + "단까지 구구단 테이블을 출력합니다. " + fileName);
    }
}
