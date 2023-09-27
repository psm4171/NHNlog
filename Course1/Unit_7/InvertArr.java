public class InvertArr {

    public static void invertArr(int [] v){
        for(int i = 0; i < v.length/2; i++){
            int tmp = v[i];
            v[i] = v[v.length - 1 -i];
            v[v.length -1 -i] = tmp;
        }
    }
    public static void main(String[] args){

        int [] v = {5,3,9,2,16};
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

        System.out.println("반전한 결과 ");

        invertArr(v);
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

    }
}
