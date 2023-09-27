package Exercises;

public class Main10 {

    public static boolean lowerTriangular(int[][] M) {

        for(int i = 0; i < M.length; i++){
            for(int j = i; j < M[0].length; j++){
                if(M[j][i] == 0){
                    return false;
                }
            }
        }

        for(int i = 0; i < M.length; i++){
            for(int j = i + 1; j < M[0].length; j++){
                if(M[i][j] != 0){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 1}
        };

        boolean checkLowTriangle = lowerTriangular(arr);

        System.out.println(checkLowTriangle);


    }
}
