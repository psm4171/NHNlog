import java.util.Scanner;

public class LongestSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이진수를 입력하세요. ");
        String s = sc.nextLine();


        System.out.println("입력한 2진수 " + s);
        System.out.println("연속적인 0의 갯수 중 가장 큰 값을 카운트 합니다.");
        int sequence = subsequence(s);
        System.out.println(sequence);
    }

    public static int subsequence(String s){
        char bit;
        int zeroCnt = 0;
        int maxlen = 0;

        for(int i = 0; i < s.length(); i++){
            bit = s.charAt(i);

            if(bit == '0'){
                zeroCnt++;

                if(zeroCnt > maxlen){
                    maxlen = zeroCnt;
                }
//                else
//                   maxlen = Math.max(maxlen, zeroCnt);
            }
            else {
                // maxlen = Math.max(maxlen, zeroCnt);
                zeroCnt = 0;
            }
        }
        maxlen = Math.max(maxlen, zeroCnt);
        return maxlen;
    }
}
