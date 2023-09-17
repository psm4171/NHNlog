import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        String name = "ParkSeungMin";

        // 2-1
        char fistChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        System.out.println(fistChar); // P 첫 번쨰
        System.out.println(lastChar); // n 마지막


        // 2-3
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(11,12));


        System.out.println();

        //2-4

        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        str =  str.substring(str.length() - 1) + str.charAt(0);
//        System.out.println(str);

        String str = sc.next();
        String change = str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
        System.out.println(change);


        // 2-5
        // 이 프로그램은 사용자로부터 입력된 비어 있지 않은 문자열을 읽고,
        // 이 문자열의 첫 번째 문자와 마지막 문자를 서로 교환하여 출력

       // String str = "ParkSeungMin";

        char str_first = name.charAt(0); // P
        char str_last = name.charAt(name.length() -1); // n

        StringBuffer sb = new StringBuffer();

        sb.append(str_last); // 마지막 문자열
        sb.append(name.substring(1, name.length()-1)); // 첫 번쨰 문자열과 마지막 문자열 뺀 부분 출력
        sb.append(str_first); // 첫 번째 문자열 출력

        System.out.println(sb);




        // StringBuffer sb = new StringBuffer(str);
        // String changeStr = swapFirstAndLastChar(str);
//
        //  System.out.println(changeStr);

//        System.out.println(str_first); // P
//        System.out.println(str_last); // n
//        String str2 = str.replace(str_last, str_first);
//        System.out.println(str1);


    }

}



