package min.chapter3.practice;

import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {

        int years = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("초기 투자금(원금)을 입력하세요. ");
        double principal = sc.nextDouble();

        System.out.println("연중 이율을 입력하세요. ");
        double annualRate = sc.nextDouble();

        while(years < 5){
            double interest;
            interest = principal * annualRate;
            principal = principal + interest;

            years = years + 1;
            System.out.print("투자 후 가치 ");
            System.out.print(years + "년");
            System.out.printf(" Years is $");
            System.out.printf("%1.2f", principal);
            System.out.println();
        }

    }
}
