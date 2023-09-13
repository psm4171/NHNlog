public class Main {

    private static double correct = 0;

    private static final int [][] TEST_CASES = new int[][] {
            {10, 20, 30, 40},
            {5, 7, 12}
    };

    private static final int [] TEST_CASES_RESULT = {

            20,
            1
    };

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = " + test(TEST_CASES[i], TEST_CASES_RESULT[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }

    private static boolean test(int [] input, int result) {
        if (solution(input) == result) {
            correct++;
            return true;
        }

        return false;
    }

    public static int solution(int[] input) {
        int max = 0;

        for(int i = 0; i < input.length; i++){
          for(int j = i + 1; j < input.length; j++){
            if( max < GCD(input[i], input[j])) {
                 max = GCD(input[i], input[j]);
              }
          }
        }



        return max;
    }

    public static int GCD(int a, int b){
        if(b == 0) return a;
        else return GCD(b, a % b);
    }

}