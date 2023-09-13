public class Util {
    public static int max(int i, int j){
        return (i > j ) ? i : j;
    }

    public static int max(int i, int j, int k){
        return max(max(i,j),k);
    }

    public static int max(int ...values){
        int result = values[0];
        for(int i = 1; i < values.length; i++){
            result = max(result, values[i]);
        }

        return result;
    }
}
