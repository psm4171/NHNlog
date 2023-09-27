package Exercises;

public class Main5 {


    /*
    * Write a predicate static boolean equalArrays(int[] A, int[] B)
    * that returns true if the two arrays A and B are equal
    * (i.e., A[i] is equal to B[i], for each i), and false otherwise.*/

    public static boolean equalArrays(int[] A, int[] B){



        for(int i = 0; i < A.length; i++){
            if(A[i] == B[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {



        int [] arrA = {1, 2, 3};
        int [] arrB = {10, 20, 30};

        System.out.println(equalArrays(arrA, arrB));

    }
}
