package Exercises;

import java.io.File;

public class Main7 {


    public static boolean fileExists(String fileName){
        try {
            File file = new File(fileName);
            return file.exists();
        } catch(Exception e){
            return false;
        }
    }

    public static boolean isInt(String input){
        try {
            int number = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean isDouble(String input) {
        try {
            Double num = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean check(){

        String fileName = "Exercises/Main7.txt";
        String intStr = "123";
        String doubleStr = "4.5";
        String nonIntStr = "abc";
        String nonDoubleStr = "jfks";

        if(fileExists(fileName)){
            System.out.println("File is exist : " + fileName);
        }else {
            System.out.println("File is not exist!");
        }

        if(isInt(intStr)){
            System.out.println("Number is INT type : " + intStr);
        }
        else {
            System.out.println("Number is not INT type!");
        }

        if (isInt(nonIntStr)) {
            System.out.println(nonIntStr + "is Integer");
        } else {
            System.out.println(nonIntStr + "is not Integer");
        }

        if(isDouble(doubleStr)){
            System.out.println("Number is DOUBLE type : " + doubleStr);
        }
        else {
            System.out.println("Number is not DOUBLE type!");
        }

        if (isDouble(nonDoubleStr)) {
            System.out.println(nonDoubleStr + "is real Number");
        } else {
            System.out.println(nonDoubleStr + "is not real Number");
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check());
    }
}
