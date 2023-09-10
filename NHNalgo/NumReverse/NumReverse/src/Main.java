//import java.util.StringJoiner;

public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            {"123", "123", "246"},
            {"1000", "1", "2"},
            {"456", "789", "1461"},
            {"5", "5", "1"},
            {"11112", "54321", "65433"},
            {"3829", "1300", "4139"}

            };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    public static int solution(int a, int b) {
        return reverse(reverse(a) + reverse(b));
        // return reverseRecursive(reverseRecursive(a,b),b);
    }

    static int reverse(int n) {
        // String.valueOf(n) : 정수 n을 String으로 변환. -> toCharArray(). 최종으로 Char형 배열로 바꿈
        char[] arr = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder(); // 단일 스레드일 경우 StringBulider 사용
        for (int i = arr.length - 1; i > -1; i--) {
            sb.append(arr[i]); // 문자열 마지막에 추가하는 append()
        }
        return Integer.parseInt(sb.toString());
    }





}


