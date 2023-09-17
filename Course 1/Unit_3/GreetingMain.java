package Unit_3;// 3-8

import javax.swing.*;

public class GreetingMain {

    public static void printGreeting(){
        System.out.println("Good morning!");
    }

    public static void printPersonalGreeting(String firstName, String lastName){
        System.out.print("Good morning, ");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.print(lastName);
        System.out.print("!");
    }

    public static void printInformalGreeting (String name){
        System.out.println("Mr" + name + "!");

    }
    public static String personalGreeting(String firstName, String lastName){
        return "Good morning " + firstName + " " + lastName + "!";

    }

    public static void main( String [] args){

        printGreeting();
        String fn = JOptionPane.showInputDialog("First name");
        String ln = JOptionPane.showInputDialog("Last name");
        printPersonalGreeting(fn, ln);
        printInformalGreeting(fn);
        JOptionPane.showMessageDialog(null, personalGreeting(fn, ln));
        System.exit(0);
    }

}
