import java.util.Scanner;

public class SmallestArr {

    public static int theSmallestArr(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

       int smallest = theSmallestArr(array);
        System.out.println(smallest);

    }
}
