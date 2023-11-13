package min.chapter4.practice.exercise;

public class Main3 {
    public static void main(String[] args) {

        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        double average;

        snakeEyesSsum(firstDice, secondDice);

    }

    public static int snakeEyesSsum(int firstDice, int secondDice){

        int sumOfsnakeEyes = firstDice + secondDice;

        if (firstDice == secondDice) {
            System.out.println("FirstDice : " + firstDice);
            System.out.println("SecondDice : " + secondDice);
            System.out.println("Snake eyes Total Sum :  " + sumOfsnakeEyes);
        }else {
            System.out.println("FirstDice : " + firstDice);
            System.out.println("SecondDice : " + secondDice);
            System.out.println("Not Snake eyes!");
        }

        if(sumOfsnakeEyes < 1 || sumOfsnakeEyes > 13){
            throw new IllegalArgumentException("Invalid Sum of Snake Eyes.");
        }else {
            return sumOfsnakeEyes;
        }

    }

}
