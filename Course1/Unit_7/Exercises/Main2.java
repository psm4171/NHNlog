package Exercises;

public class Main2 {

    public static int[] intersection(int[] A, int [] B){

        int [] arrC = new int[5];
        int cnt = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i] == B[j]) {
                    arrC[cnt++] = A[i];
                }

            }
        }
        return arrC;
    }
    public static void main(String[] args) {

        int [] arrA = {1,2,3,4,5};
        int [] arrB = {4,5,6,3,8,};
        int [] arrC = intersection(arrA, arrB);

        System.out.println(arrC);

        for(int i = 0; i < arrC.length; i++){
            System.out.print(arrC[i] + " ");
        }

    }
}
