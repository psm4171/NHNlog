package Exercises;

public class Main1 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 0, j = 0; i < 10 && j < 10; i++, j++){
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        System.out.println("I’ve printed out the sums of i and j up to "
                + i + "," + j);
    }
}
