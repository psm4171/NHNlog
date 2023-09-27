public class EqualArr {

    public static boolean searchArr(String[] v, String e){

        int size = v.length;
        for(int i = 0; i < size; i++) {
            if (e.equals(v[i])) {
                return true;
            }
        }
            return false;
    }

    public static void main(String[] args){

        String[] x = {"one", "two", "three"};

        if(searchArr(x, "two")){
            System.out.println("Present");
        }
        else
            System.out.println("Not present");

    }
}
