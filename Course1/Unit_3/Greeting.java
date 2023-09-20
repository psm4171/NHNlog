package Unit_3;

public class Greeting {
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

}
