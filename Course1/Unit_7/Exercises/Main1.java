package Exercises;

public class Main1 {

    public static double scalarProduct(double[] A, double[] B){

        double result = 0.0;
            for(int i = 0; i < A.length; i++){
                result += A[i] * B[i];
            }
            return result;
    }
    public static void main(String[] args) {

        double [] arrA = {1.0, 2.0, 3.0};
        double [] arrB = {4.0, 5.0, 6.0};

        double sum = scalarProduct(arrA, arrB);

        System.out.println(sum);

    }
}
