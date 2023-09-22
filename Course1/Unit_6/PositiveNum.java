import java.util.Scanner;

public class PositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = 'o';

        int charCount = countChar(s, c);
        System.out.println(charCount);

        int cnt = 0;

        String ss = sc.next();

        while( !ss.equals("null")){
            int num = Integer.parseInt(ss);
            if(num > 0){
                cnt++;
                System.out.println("양수 : " + num);
            }

            //   ss = sc.next();
            break;

        }

//        int countPositive = countPositive(ss, cnt);
        System.out.println(countPositive(ss, cnt));

    }

    public static int countChar (String s, char c){
        int numChar = 0;
        int pos = 0;
        while(pos < s.length()){
            if(s.charAt(pos) == c)
                numChar++;
            pos++;
        }
        return numChar;
    }

    public static int countPositive (String s, int cnt){
        int count = 0;
        while(s != null){
            if(Integer.parseInt(s) > 0){
                count++;
                System.out.println(s);
            }
            //   System.out.println(count);
            break;
        }
        return count;
    }
}
