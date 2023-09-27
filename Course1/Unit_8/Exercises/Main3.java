package Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {

    public static void specialChar(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = br.readLine()) != null){
            if(line.startsWith("/") || line.startsWith(";") || line.startsWith("%")){
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "Exercises/psmMain3.txt";
        specialChar(fileName);

    }
}
