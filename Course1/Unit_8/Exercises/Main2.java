package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static double calculateAverage(BufferedReader br) throws IOException {
        int count = 0;
        double sum = 0;
        double number;

        System.out.print("정수를 입력하세요 : ");
        while ((number = Double.parseDouble(br.readLine())) != 0) {
            System.out.print("Input Number: ");
            sum += number;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers entered. ");
            return 0;
        }

        return sum / count;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        double average = calculateAverage(br);
        System.out.println("평균 : " + average);
    }
}

