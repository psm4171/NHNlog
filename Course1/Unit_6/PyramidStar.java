import java.util.Scanner;

public class PyramidStar {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int height = sc.nextInt();
            int row;

            for(row = 1; row <= height; row++){
                for(int i = 0; i <= height - row; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i <= 2 * row -1; i++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
}
