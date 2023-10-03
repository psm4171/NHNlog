import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveMax {

    public static int maximum(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null || s.equals("")) {
            return 0; // 음수 최솟값을 반환하여 최대값을 찾을 때 초기화될 수 있도록 함
        } else {
            int i = Integer.parseInt(s);
            int m = maximum(br);
            return  Math.max(m, i); // Math.max를 사용하여 더 큰 값을 반환
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = maximum(br);

        if (max == Integer.MIN_VALUE) {
            System.out.println("No positive integers entered.");
        } else {
            System.out.println("Maximum value: " + max);
        }
    }
}
