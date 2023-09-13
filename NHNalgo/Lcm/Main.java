public class Main {

    private static double correct = 0;

    private static final int [][] TEST_CASES = {
            {1, 1},
            {98, 49},
            {2, 81},
            {3, 7},
            {19, 87},
            {1, 40}
    };

    private static final int [] TEST_CASES_RESULT = {

            1,
            98,
            162,
            21,
            1653,
            40
    };

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = " + test(TEST_CASES[i], TEST_CASES_RESULT[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }

    private static boolean test(int [] input, int result) {
        if (solution(input[0], input[1]) == result) {
            correct++;
            return true;
        }

        return false;
    }

    // solution
    private static int solution(int first, int second) {

       return lcm(first, second);
    }

    private static int gcd(int first, int second){
        if(second == 0){
            return first;
        }
        else return gcd(second, first % second);

    }

    private static int lcm(int first, int second){
        if(second == 0){
            return first;
        }

        else return (first * second) / gcd(first, second);
    }

}