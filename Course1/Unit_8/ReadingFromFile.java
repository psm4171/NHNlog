import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("fromFile.txt");
        BufferedReader in = new BufferedReader(f);

        String line = in.readLine();
        System.out.println(line);

        f.close();
    }
}
