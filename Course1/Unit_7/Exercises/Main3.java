package Exercises;

import java.util.Arrays;

public class Main3 {

    public static double[][] transposeMatrix(double[][] M){

        // 행 : M.length
        // 열 : M[0].length
       // double [][] transpose = new double[M.length][M[0].length];

        double [][] transpose = new double[M[0].length][M.length];

        for(int i = 0; i < M.length; i ++){
            for(int j = 0; j < M[i].length; j++){
               // transpose[j][i] = M[i][j];
                transpose[i][j] = M[j][i];
            }
        }
        return transpose;
    }


    public static void main(String[] args) {

//        double [][] matrix = {
//                {1.0, 2.0, 3.0},
//                {11.0, 12.0, 13.0},
//                {21.0, 22.0, 23.0}
//        };
        double [][] matrix = {
                {1.0, 2.0},
                {11.0, 12.0},
                {21.0, 22.0}
        };

       double [][] result = transposeMatrix(matrix);

//       for(int i = 0; i < matrix[0].length; i++) {
//           for (int j = 0; j < matrix.length; j++) {
//               System.out.print(result[i][j] + " ");
//           }
//           System.out.println();
//       }

        for(double[] res : matrix) {
            System.out.println(Arrays.toString(res));
        }

    }
}
