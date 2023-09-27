public class SumofMatrix {

    public static int[] matixSumRows(int [][] M) {
        int[] C = new int[M.length];
        for(int i = 0; i < M.length; i++){

            C[i] = 0;
            for(int j = 0; j < M[i].length; j++){
                C[i] += M[i][j];
            }
        }
        return C;
    }
    public static void main(String[] args){
        int [][] A = {
                {1, 2, 2},
                {7, 5, 9},
                {3, 0, 6}
        };

        int [] B = matixSumRows(A);

        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();


    }
}
