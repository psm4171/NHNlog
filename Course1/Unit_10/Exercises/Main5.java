package Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
    public static int countOne(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        return countOneRecursion(br);
    }

    public static int countOneRecursion(BufferedReader br) throws IOException {
        String b = br.readLine();
        if(b == null){
            br.close();
            return 0;
        }

        int count = 0;

        for(char digit : b.toCharArray()){
            if(digit == '1'){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) throws IOException {
        String fileName = "Exercises/Main5.txt";
        int countsOne = countOne(fileName);
        System.out.println(countsOne);

    }
}
