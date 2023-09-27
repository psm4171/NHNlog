package Exercises;

import java.util.HashSet;

public class Main6 {
    /*
A duplicate in an array is a value that appears more than once as element of the array. Write
a method static int numberOfDuplicates(int[] A) that returns the number of distinct duplicates in the
array A. Write also a method static int numberOfDistinctValues(int[] A) that returns the number of
distinct values in the array A.
     * */

    public static int numberOfDuplicates(int[] A){

        boolean [] duplicate = new boolean[A.length];
        int cnt = 0;
        for(int i = 0; i < A.length; i++){
            if(!duplicate[i]){
                for(int j = i + 1; j < A.length; j++){
                    if(A[i] == A[j]) {
                        duplicate[j] = true;
                        cnt++;
                        break;
                    }
                }
            }
        }
        return cnt;

    }

    public static int numberOfDistinctValues(int[] A) {

        boolean [] distinct = new boolean[A.length];

        int cnt = 0;
        for(int i = 0; i < A.length; i++) {
            if (!distinct[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        isDuplicate = true;
                        distinct[j] = true;
                    }

                }
                if (!isDuplicate) {
                    cnt++;
                }
            }

        }
        return cnt;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 2};

        int duplicate = numberOfDuplicates(arr);
        int distinctDuplicate = numberOfDistinctValues(arr);

        System.out.println("중복된 배열의 원소 갯수 : " + duplicate);
        System.out.println("중복되지 않는 배열의 원소 갯수 : " + distinctDuplicate);


    }

}