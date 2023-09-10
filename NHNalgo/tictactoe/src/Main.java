
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {


//00 01 02
//10 11 12
//20 21 22
    public static void gameBoard(String [][] arr){
        int i,j;
       // String [][] arr =
        for(i=0; i<arr.length; i++){
            for(j=0; j< arr.length; j++){
                System.out.print(arr[i][j]);
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }

    public static String gameWinner(String [][] arr) {
        for (int i = 0; i < arr.length; i++) {
             if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] != " "){
                 return arr[i][0];
             }
             if(arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && arr[2][i] != " "){
                 return arr[0][i];
             }

             // 대각선 동일한 경우
             if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] != " "){
                 return arr[0][0];
             }

             if(arr[2][0] == arr[1][1] && arr[1][1] == arr[2][0] && arr[2][0] != " "){
                 return arr[2][0];
             }

        }
        return "";

    }

    public static void userChoice(String[][] arr, int x, int y){
       arr[x][y] = "O";
    }

    // 컴퓨터의 랜덤 선택
    public static void computerChoice(String [][] arr) {
        Random rand = new Random();

        while (true) {
            int x = rand.nextInt(3);
            int y = rand.nextInt(3);
            if (arr[x][y] == " ") {
                arr[x][y] = "X";
                break;
            }
            // 꽉 참
        }
    }

    public static void main(String[] args) {

        int i, j;
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[3][3];

        System.out.println("틱 택 토 게임을 시작합니다.");


        // 게임 화면 표시
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                arr[i][j] = " ";
            }
        }

        gameBoard(arr);

        while (true) {
            System.out.print("위치를 선택하세요.(0~2, 예시 1 2) : ");

            try {
             int x = sc.nextInt();
             int y = sc.nextInt();
          //    if(!sc.hasNext())

                if (arr[x][y] != " ") {
                    System.out.println("이미 선택된 영역입니다.");
                    continue;
                }

                userChoice(arr, x, y);
                computerChoice(arr);
                gameBoard(arr);
            } catch (InputMismatchException e) {
                System.out.println("문자를 입력하면 안됩니다! 좌표를 숫자로 입력하세요. "); // 예외처리 되어도 코드 실행
                e.printStackTrace();
                sc.nextLine();
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("알맞는 인덱스를 벗어났습니다! 0~2 범위에서 좌표를 입력하세요."); // 예외처리 되어도 코드 실행
                e.printStackTrace();
                sc.nextLine();
                continue;

            }

            String winner = gameWinner(arr);

            if (winner.equals("O")) {
                System.out.println("축하합니다. 게임에서 이겼습니다!");
                break;
            } else if (winner.equals("X")) {
                System.out.println("아쉽지만, 게임에서 졌습니다.");
                break;
            }
        }


    }
}

