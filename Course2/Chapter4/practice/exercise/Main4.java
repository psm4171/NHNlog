package min.chapter4.practice.exercise;

public class Main4 {
    public static void main(String[] args) {

        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        double average;

        snakeEyesSsum(firstDice, secondDice);

        System.out.println();

        System.out.println("주사위의 총합       평균 굴림 횟수"  );
        System.out.println("-------------       --------------" );

        for(int dice = 2; dice <= 12; dice++) {
            average = getAverage(dice);
            System.out.printf("%10d%22.4f\n",dice, average);
        }
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

    public static double getAverage(int roll){
        int rollCount = 0;
        int rollTotal = 0;
        double averageRollCount;

        for(int i = 0; i < 10000; i++){
            rollCount = rolling(roll);
            rollTotal += rollCount;
        }

        averageRollCount = ((double) rollTotal) / 10000;
        return averageRollCount;
    }

    public static int rolling(int n){
        int roll;
        int rollcnt = 0;
        do {
            int firstDice = (int)(Math.random()*6) + 1;
            int secondDice = (int)(Math.random()*6) + 1;
            roll = firstDice + secondDice;
            rollcnt++;
        } while ( roll != n );
        return rollcnt;
    }

}
