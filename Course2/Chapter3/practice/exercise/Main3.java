package min.chapter3.exercise;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("표현식 입력 : ");
        Scanner sc = new Scanner(System.in);
        double result = 0.0;

        while(true){

            double firstNum = sc.nextDouble();
            char operator = sc.next().charAt(0);
            double secondNum = sc.nextDouble();

            if(firstNum == 0)
                break;


            switch(operator){
                case '+':
                    result = firstNum + secondNum;
                    System.out.println(result);
                    break;
                case '-':
                    result = firstNum - secondNum;
                    System.out.println(result);
                    break;
                case '*':
                    result = firstNum * secondNum;
                    System.out.println(result);
                    break;
                case '/':
                    result = firstNum / secondNum;
                    System.out.println(result);
                    break;
                case 'n':
                    return;
            }
        }


    }
}
