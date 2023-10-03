import java.io.*;

public class SymmetricInt {

    public static boolean symmetric(BufferedReader br) throws IOException {

        String b = br.readLine();

        if (b == null) {
            throw new IOException("Invalid input");
        }

        int n = Integer.parseInt(b);

        if (n == 0) {
            return true;
        } else {
            if(b == null){
                throw new IOException("Invalid input: Sequence is incomplete.");
            }
            int m = Integer.parseInt(b);
             return (n == m);
        }
    }



    public static void main(String[] args) {
        try{
            String fileName = "./symmetric.txt";
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            boolean issym = symmetric(br);

          //  System.out.println(issym);

            if(issym){
                System.out.println("Symmetric");
            }
            else {
                System.out.println("NonSymmetric");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
