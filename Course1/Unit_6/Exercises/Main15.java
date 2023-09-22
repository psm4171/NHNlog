package Exercises;

import static Exercises.Message.removeVowels;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Message message = new Message("seungmin", "minseung", "nice     to meet   you!");
        System.out.println(message);

        message.swap();
        System.out.println(message);

        message.eliminationBlank();
        System.out.println(message);

        String removeVowels = removeVowels(message.getText());
        System.out.println(removeVowels);


    }


}
