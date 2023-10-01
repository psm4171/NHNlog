public class CountStrC {
    public static int countChars(String s, char c){
        if(s.length() == 0){
            return 0;
        }
        else if (s.charAt(0) == c)
            return 1 + countChars(s.substring(1), c);
        else
            return countChars(s.substring(1), c);
    }
    public static void main(String[] args) {
        String s = "asddccsfccc";
        char c = 'c';
        System.out.println(countChars(s, c));

    }
}
