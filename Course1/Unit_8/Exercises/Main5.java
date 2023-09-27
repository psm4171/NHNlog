package Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {

    public static String averageHighest(String fileName) throws IOException {

        String studentHighest = "";
        double averageHigest = 0.0;


        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length > 1) {
                String studentName = parts[0];
                double totalCal = 0.0;
                int cnt = 0;
                for (int i = 1; i < parts.length; i++) {
                    int cal = Integer.parseInt(parts[i]);
                    totalCal += cal;
                    cnt++;

                }
                double avg = totalCal / cnt;

                if (avg > averageHigest) {
                    averageHigest = avg;
                    studentHighest = studentName;
                }
            }
        }

            return studentHighest;
        }


    public static void main(String[] args) throws IOException {
        String fileName = "Exercises/Main5_avgInfo.txt";
        String findHigest = averageHighest(fileName);

        if (!findHigest.isEmpty()) {
            System.out.println("가장 높은 학생 : " + findHigest);
        } else {
            System.out.println("Empty file!");
        }
    }
}
