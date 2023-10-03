import javax.swing.*;

public class HonoiTop {

    private static void moveDisk(int first, int dest){
        System.out.println("디스크를 " + first + "에서 " + dest +"로 옮깁니다.");
    }
    private static void move(int n, int first, int dest, int middle){
        if(n == 1)
            moveDisk(first, dest);
        else {
            move(n-1, first, middle, dest);
            moveDisk(first, dest);
            move(n-1, middle, dest, first);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("How many disks do you want to move?"));
        System.out.println("To move :" + n + ": disks from 1 to 2 using 3");
        move(n, 1, 2, 3);
        System.exit(0);
    }
}
