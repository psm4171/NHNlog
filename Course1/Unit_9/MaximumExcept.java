import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaximumExcept {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("maximum.txt"));
        int max = -1;

        String line = br.readLine();
        while(line != null){
            int n = Integer.parseInt(line);
            if(n > max ) max = n;
            line = br.readLine();

        }
        System.out.println("Max : " + max);
    }
}
