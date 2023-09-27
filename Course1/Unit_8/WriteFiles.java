import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFiles {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("test1.txt");
        PrintWriter out = new PrintWriter(f);

        out.println("hello world!");

        out.close();
        f.close();
    }
}
