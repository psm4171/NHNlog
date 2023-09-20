package Unit_3;// 3-9
import Unit_3.Greeting;
import javax.swing.*;

public class GreetingClient {
    public static void main(String [] args){
        Greeting.printGreeting();
        String fn = JOptionPane.showInputDialog("First Name");
        String ln = JOptionPane.showInputDialog("Last name");
        Greeting.printPersonalGreeting(fn, ln);
        Greeting.printInformalGreeting(fn);
        JOptionPane.showMessageDialog(null, Greeting.personalGreeting(fn, ln));
        System.exit(0);
    }
}
