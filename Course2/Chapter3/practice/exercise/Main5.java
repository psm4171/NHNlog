package min.chapter3.exercise;

import java.io.*;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) throws IOException {

        try {
            File fileName = new File("/Users/parkseungmin/IdeaProjects/NHN_TEAM_10_2/src/main/java/min/chapter3/exercise/sales.txt");
            Scanner sc = new Scanner(fileName);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
