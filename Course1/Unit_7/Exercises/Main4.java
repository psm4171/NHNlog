package Exercises;

public class Main4 {

/*

 Write a method, static int[] matrixSumColumns(int[][]), that takes as parameter a matrix and returns an array with one element for each column of the matrix; the element of index i of the array
must be equal to the sum of the elements of column i of the matrix.

* */
    public static int[] matrixSumColumns(int[][] M){

        // 행 : M.length
        // 열 : M[0].length

        int [] sumCol = new int[M[0].length];

        // Sum of M[0].length
        for(int j = 0; j < M[0].length; j++){
            int sum = 0;
            for(int i = 0; i < M.length; i++){
                sum += M[i][j];
            }
            sumCol[j] = sum;
          }
        return sumCol;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };

        int[] sumOfCol = matrixSumColumns(matrix);

        for(int i = 0; i < matrix.length; i++){
            System.out.println(i + " : " + sumOfCol[i] + " ");
        }
    }
}
