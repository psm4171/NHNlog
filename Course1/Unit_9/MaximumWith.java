import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumWith {
    public static void main(String[] args) throws Exception {

        try {
            BufferedReader br = new BufferedReader(new FileReader("maximum.txt"));
            int max = -1;

            String line = br.readLine();
            while (line != null) {
                int n = Integer.parseInt(line);
                if (n > max) max = n;
                line = br.readLine();
            }
            if (max == -1)
                throw new Exception("File Empty or num < 0");
            else System.out.println("Max : " + max);
         }
        catch(IOException e){
            System.out.println("File can't read.");
        } catch(NumberFormatException e){
            System.out.println("The file contains non numeric data. ");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
