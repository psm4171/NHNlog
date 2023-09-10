/*
public class ReverseString {
    public static int reverse(int num){
        int res = 0;
        while(num > 0){
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return res;
    }

    public static int reverseRecursive(int num, int result) {
        if(num == 0){
            return result;
        }
        else {
            result = result * 10 + num % 10;
            return reverseRecursive(num /10, result);
        }
    }

    public static void main(String[] args){

    }

}

 */
