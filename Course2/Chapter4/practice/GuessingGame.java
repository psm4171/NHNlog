package min.chapter4.practice;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("숫자 추측 게임을 시작합니다. ");
        boolean playAgain;

        Scanner sc = new Scanner(System.in);

        do{
            playGame();
            System.out.println("게임을 다시 시작합니까? (true, false)");
            playAgain = sc.nextBoolean();
        }while(playAgain);
        System.out.println("게임을 종료합니다. ");

    }

    static void playGame() {


            int computerNum;
            int userNum;
            int geussCount = 0;

            computerNum = (int) (Math.random() * 100) + 1;
            System.out.println(computerNum);
            System.out.println("입력할 숫자는 무엇입니까? ");

            while (true) {
                Scanner sc = new Scanner(System.in);
                userNum = sc.nextInt();
                geussCount++;
                if (userNum == computerNum) {
                    System.out.println(geussCount + "번을 시도해서 " + computerNum + "를(을) 맞췄습니다!");
                   break;
                }

                if (userNum < computerNum) {
                    System.out.println("입력한 숫자가 너무 낮습니다. ");
                } else System.out.println("입력한 숫자가 너무 높습니다. ");

                if (geussCount == 6) {
                    System.out.println("6번의 입력 추측 초과로 게임에서 졌습니다.");
                    break;
                }
            }
    }
}
