package Exercises;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        Triangle tr = new Triangle(first, second, third);

        tr.checkSide(first, second, third);

        System.out.println( tr.checkSide(first, second, third));

        tr.checkType();

        tr.printInfo();

        sc.close();


    }

}
