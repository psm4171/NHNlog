package Exercises;

public class Main7 {


/*
* Write a method static int[] removeDuplicates(int[] A)
* that returns a new array obtained from A by removing all duplicates.
* The duplicates should be removed by keeping only the first occurrence
of each distinct element, and shifting remaining elements upwards when a duplicate is removed.*/

    public static int[] removeDuplicates(int[] A) {

        int newArr = 1;
        for(int i = 0; i < A.length; i++){
            boolean duplicate = false;
            for(int j = 0; j < newArr; j++){
                if(A[i] == A[j]){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate){
                A[newArr] = A[i];
                newArr++;
            }
        }

        int [] result = new int[newArr];
        for(int i = 0; i < newArr; i++){
           result[i] = A[i];
        }
        return result;

    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,5,3};
        int [] removeDup = removeDuplicates(arr);

       for(int i = 0; i < removeDup.length; i++){
           System.out.print(removeDup[i] + " ");
       }

    }
}
