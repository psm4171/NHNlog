import javax.swing.*;

public class Stot {
    public static void main(String[] args) {

        String stot = "";

        String s = JOptionPane.showInputDialog("Input String");

        while(s != null){
            if(s.charAt(0) == ':'){
                stot = stot + s;
            }
            s = JOptionPane.showInputDialog("Input String");
        }
        System.out.println("누적 문자열 : " + stot);
    }
}
