package min.chapter4.practice;

import java.util.Scanner;

public class Lambda {

    static double sum(FunctionR2R f, int start, int end){
        double total = 0;
        for(int n = start; n <= end; n++){
            total += total += f.valueAt(n);
        }
        return total;
    }

    static void doServeralTimes(Runnable task, int repCount){
        for(int i = 0; i < repCount; i++){
            task.run();
        }
    }
    public static void main(String[] args) {
        //int x;

        System.out.println("1부터 100까지의 n에 대해 n의 제곱의 합은 ");
        System.out.println(sum( x-> x * x, 1, 100));

        doServeralTimes( () -> {
            int count = 5 + (int)(21*Math.random());
            for(int i = 1; i <= count; i++){
                System.out.print(i  + " ");
            }
            System.out.println();
        }, 5);


    }
}
