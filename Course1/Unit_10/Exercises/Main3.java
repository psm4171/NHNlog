package Exercises;

public class Main3 {

    public static int cnt = 0;

    public static int ackermann(int m ,int n){
        cnt++;
        if(m == 0){
            return n+1;
        }
        else if(n == 0){
            return ackermann(m-1, 1);

        }
        else return ackermann(m-1, ackermann(m, n-1));
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(ackermann(3,2));
        System.out.println("함수가 호출된 횟수 : " + cnt);
    }
}
