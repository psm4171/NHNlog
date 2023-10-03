public class Palindrome {
    public static boolean palindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        else
            return (s.charAt(0) == s.charAt(s.length() - 1)) &&
                    palindrome(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        String str = "aba";
        boolean result = palindrome(str);
        System.out.println(result);

    }
}
