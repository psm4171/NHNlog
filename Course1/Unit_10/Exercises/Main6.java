package Exercises;

public class Main6 {

    public static int longestSequence(String s, char c) {
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                cnt++;
                max = Math.max(max, cnt);
            }
            else cnt = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "acbccdcccc";
        char find = 'c';

        System.out.println(longestSequence(s, find));

    }

}
