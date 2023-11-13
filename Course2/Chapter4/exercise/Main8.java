package min.chapter4.practice.exercise;

import java.util.Scanner;

public class Main8 {
    private static int number1[];
    private static int number2[];

//    public Main8(int number1, int number2) {
//        this.number1 = number1;
//        this.number2 = number2;
//    }

    public static void generateQuiz(int[] number1, int[] number2, int[] answer){
         number1 = new int[10];
         number2 = new int[10];

         for(int i = 0; i < 10; i++){
             number1[i] = (int) (Math.random() * 50);
             number2[i] = (int) (Math.random() * 50);
             answer[i] = number1[i] + number2[i];

             System.out.print(i+1 + ": " + number1[i] + " + " + number2[i]);
             System.out.println(" = "  + answer[i]);

         }

    }

    public static void manageQuiz(int[] number1, int[] number2, int[] answer){
        for(int i = 0; i < 10; i++){
           // answer[i] = number1[i] + number2[i];
            Scanner sc = new Scanner(System.in);
            answer[i] = sc.nextInt();
            System.out.println(i+1 + "의 정답은 : " + answer[i]);
        }
    }

    public static void checkQuiz(int[] number1, int[] number2, int[] answer){
        int correctAnswer;
        int correctCount = 0;
        for(int i = 0; i < 10; i++){
            correctAnswer = number1[i] + number2[i];
            if(answer[i] == correctAnswer){
                correctCount++;
                System.out.println("맞은 갯수는 " + correctCount);
            }
           // System.out.printf("%2d + %2d = %2d", number1[i], number2[i], correctAnswer);

        }
    }
    public static void main(String[] args) {

        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] answer = new int[10];

        generateQuiz(num1, num2, answer);
        System.out.println("정답을 입력하세요.");
        manageQuiz(num1, num2, answer);
        checkQuiz(num1, num2, answer);


    }
}
