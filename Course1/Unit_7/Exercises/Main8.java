package Exercises;

public class Main8 {
    // What does the following method calculate? --> Count odd Number Method
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 1) x++;
        return x;
    }

}
