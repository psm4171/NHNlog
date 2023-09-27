package Exercises;

public class Main9 {

    static boolean symmetric(int[][] M){
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < i; j++){
                if(M[i][j] != M[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int [][] arr = {
                {1, 2, 1},
                {2, 4, 2},
                {1, 2, 1}
        };

        boolean sysmetricCheck = symmetric(arr);
        System.out.println(sysmetricCheck);

    }
}
