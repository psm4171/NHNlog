package Exercises;

public class Main11 {

    public static boolean diagonal(int[][] M) {

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                if(M[j][i] != 0 && M[i][j] != 0 && i != j){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int [][] arr = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };

        boolean diagoanlCheck = diagonal(arr);
        System.out.println(diagoanlCheck);

    }
}
