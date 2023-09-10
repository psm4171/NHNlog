package Sample.src;

import Sample.src.BinaryOP;
import Sample.src.Multi;
import Sample.src.Adder;
import java.util.Scanner;

public class Main {
    public static int addIter(int n) {

        if (n <= 0) {
            return -1;
        } else {
            addIter(n - 1);
            System.out.println(n);
        }
        return n;
    }

    // Add i + j
    public static int sigma(int start, int end, int step) {
//        int result = 0;
//        for(int i= init; i <= end; i++ ){
//            result = result + i;
//        }
//
//        return result;

        return calc((i, j) -> i + j, 1, 10, 1, 0);
    }


    // 메서드 오버로딩
    // Adder Class의 메서드를 호출
    public static int omega(int start, int end, int step) {
        return calc(new Adder(), 1, 10, 1, 0);

    }

    // i * j
    // Multi Class의 메서드를 호출
    public static int pi(int start, int end, int step) {
        //return calc(new Multi(), 1,10,1,1);
        return calc((i, j) -> i * j, 1, 10, 1, 0);
    }

    public static int calc(BinaryOP binder, int start, int end, int step, int init) {

        int res = init;
        for (int i = start; i <= end; i += step) {
            res = binder.apply(res, i);

            //        int [] result = new int [2];
//        for(int i= init; i <= end; i++ ){
//            result[0] = binder.apply(result[0], i);
//            result[1] = bi.apply(result[1], i);
//        }
//        return result;
        }
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(addIter(n));

        System.out.println();

        System.out.println(sigma(1,3,1));

        System.out.println(omega(1,3,1));

        System.out.println(pi(1,3,1));
    }
}