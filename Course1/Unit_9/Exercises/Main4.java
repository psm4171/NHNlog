package Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {

        try {
            FileReader f = new FileReader("Exercises/Main4.txt");
            BufferedReader in = new BufferedReader(f);

            int n = 10;
            int[] v = new int[n];
            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
            f.close();
            System.out.println(i);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Error! ");
        }
    }
}
