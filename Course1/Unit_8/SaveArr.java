import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveArr {

    public static void saveArr(String[] v, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);
        for(int i = 0; i < v.length; i++){
            out.println(v[i]);
        }
        out.close();
        f.close();
    }
    public static void main(String[] args) throws IOException {


       String [] arr = {"hi", "psm"};

       try {
           saveArr(arr, "savefile.txt");
           System.out.println("Successful");

       } catch(IOException e){
               e.printStackTrace();
           }
    }
}
