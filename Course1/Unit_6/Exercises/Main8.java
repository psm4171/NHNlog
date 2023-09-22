package Exercises;

public class Main8 {
    static final int SIZE = 9;

    public static void main(String[] args) {
        int row, col = 0;
        for(row = 1; row <= SIZE; row++){
            for(col = 1; col <= SIZE; col++){
                System.out.print(row * col + " ");
            }
            System.out.println();
        }
    }
}
