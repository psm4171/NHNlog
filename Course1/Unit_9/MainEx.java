import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx {
    public static void main(String[] args) throws Exception {
        int min = 10, max = 30;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a number between " + min + " and  " + max + " included ");
        int val = Integer.parseInt(br.readLine());
        if(val < min || val > max)
            throw new Exception("the val is not in the allowed interval");
        System.out.println("the val is in the allowed interval");

    }
}
