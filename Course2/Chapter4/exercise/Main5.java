package min.chapter4.practice.exercise;

public class Main5 {
    public static ArrayProcessor counter( double value ) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] == value){
                    count++;
                }
            }
            return count;
        };

    }

    public static final ArrayProcessor max = array -> {
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }

        }
        return max;
    };

    public static final ArrayProcessor min = array -> {
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    };

    public static final ArrayProcessor sum = array -> {
        double sum = array[0];
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    };

    public static final ArrayProcessor avg = array -> {
      double avg = array[0];
      for(int i = 0; i < array.length; i++){
          avg = sum.apply(array) / array.length;
      }

      return avg;
    };


    public static void main(String[] args) {

        double[] arr = {1, 2, 3, 4, 5};


        System.out.println("Maximum : " + max.apply(arr));
        System.out.println("Minimul : " + min.apply(arr));
        System.out.println("Sum : " + sum.apply(arr));
        System.out.println("Average : " + avg.apply(arr));


    }
}
