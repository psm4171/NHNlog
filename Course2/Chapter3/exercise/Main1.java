package min.chapter3.exercise;

public class Main1 {
    public static void main(String[] args) {
        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;

        if (firstDice == secondDice) {
            System.out.println(firstDice);
            System.out.println(secondDice);
            System.out.println("Snake eyes! ");
        }else {
            System.out.println(firstDice);
            System.out.println(secondDice);
        }
    }
}
