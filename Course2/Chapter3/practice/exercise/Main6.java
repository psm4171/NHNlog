package min.chapter3.exercise;

public class Main6 {
    public static void main(String[] args) {

        int testedNumber;
        int max = 0;
        int divisorCount = 0;
        int [] maxDivisorNum = new int[10000];
        int maxCount = 0;

        for(int n = 1; n <= 10000; n++){

            divisorCount = 0;
            for(testedNumber = 1; testedNumber <= n; testedNumber++) {
                if (n % testedNumber == 0) {
                    divisorCount++;
                }
            }
            if(divisorCount > max){
                max = divisorCount;
                maxCount = 0;
                maxDivisorNum[maxCount] = n;
            }else if(divisorCount == max){
                maxCount++;
                maxDivisorNum[maxCount] = n;
            }
        }


        System.out.println("약수의 최대 갯수는 "  + max);

        System.out.println("이러한 약수의 갯수를 가진 숫자들은: " );

        for (int i = 0; i <= maxCount; i++) {
            System.out.println(maxDivisorNum[i]);
        }

    }
}
