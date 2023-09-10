import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Hello world!");
    }

    public String DetoBi(int n, int convert){
        if(convert == 2) {
            if (n == 0) {
                return "0";
            }

            String bi = "";

            while (n > 0) {
                int i = n % 2;
                bi = i + bi;
                n /= 2;
            }
            return bi; // 10진수를 2진수로
        }else if(convert == 8){
            int oct = 0;
            int i = 1;
            while(n != 0){
            oct += (n % 8) * i;
            i *= 10;
            }
        }


    }
}