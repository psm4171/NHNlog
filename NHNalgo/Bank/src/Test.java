public class Test {
    public static void main(String [] args){
        Balance b1 = new Balance(10);
        Balance b2 = new Balance(5);

        b1 = b1.add(b2);

        if (b1.compareTo(b2) == 0) {

        }

    }
}
