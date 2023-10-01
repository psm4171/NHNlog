import javax.swing.*;

public class ActivationOfRecursive {
    public static void recursive(int i) {
        System.out.print("In recursive(" + i + ")");
        if (i == 0)
            System.out.println(" - Finished");
        else {
            System.out.println(" - Activation of recursive("
                    + (i-1) + ")");
            recursive(i-1);
            System.out.print("Again in recursive(" + i + ")");
            System.out.println(" - Finished");
        }
        return;
    }
    public static void main(String[] args) {
        int j;
        System.out.print("In main");
        j = Integer.parseInt(JOptionPane.showInputDialog(
                "Insert a non-negative integer"));
        System.out.println(" - Activation of recursive(" + j + ")");
        recursive(j);
        System.out.print("Again in main");
        System.out.println(" - Finished");
        System.exit(0);
    }
}
