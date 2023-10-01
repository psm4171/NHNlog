import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SymmetricInt {

    public static boolean symmetric(BufferedReader br) throws IOException {
        if(br.readLine() == null){
            throw new IOException("Invalid input: Sequence is incomplete.11");
        }
        int n = Integer.parseInt(br.readLine());
        if(n == 0){
            return true;
        }
        else {
            boolean sym = symmetric(br);
            if(br.readLine() == null){
                throw new IOException("Invalid input: Sequence is incomplete.");
            }
            int m = Integer.parseInt(br.readLine());
            return (n == m) && sym;
        }
    }
    public static void main(String[] args) {
        try{
            String fileName = "../Unit10/symmetric.txt";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            boolean issym = symmetric(br);

            if(issym){
                System.out.println("Symmetric");
            }
            else {
                System.out.println("NonSymmetric");
            }

            System.out.println(symmetric(br));

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
