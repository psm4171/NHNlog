package min.chapter3.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
      //  boolean apostrophe;

        String[] texts = inputText.split("\\s+");

        for(String text : texts) {
            String textWord = text.replaceAll("[^a-zA-Z]", "");
            System.out.println(textWord);

        }

    }
}
