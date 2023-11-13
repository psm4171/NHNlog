package min.chapter4.practice.exercise;

public class Main1 {
    public static void main(String[] args) {
        String text = "Now is the time to act!";
        printCapitalized(text);

    }

    public static void printCapitalized(String text){
       char ch;
       char prev = ' ';

       for(int i = 0; i < text.length(); i++){
           ch = text.charAt(i);
           if(Character.isLetter(ch) && !Character.isLetter(prev)){
               System.out.print(Character.toUpperCase(ch));
           }else {
               System.out.print(ch);
           }
           prev = ch;
        }
    }
}
