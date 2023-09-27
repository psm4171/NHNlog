import java.util.Scanner;

public class ArrSum {
    public static int sumArr(int[] v){

        int sum = 0;
        for(int i = 0; i < v.length; i++){
            sum += v[i];
        }
        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int [] v = {4, 6, 3, 1};

        int sum = sumArr(v);
        System.out.println(sum);
    }
}
