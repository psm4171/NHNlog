package Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOFile {
    private String fileName;
    public IOFile(String fileName){
        this.fileName = fileName;
    }

    public int countLines() throws IOException, ExceptionLineTooLong {
        int lineCount = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while(br.readLine() != null){
                lineCount++;
            }
        }
        return lineCount;
    }

    public void write(OutputStream os) throws IOException{
        try (InputStream is = new FileInputStream(fileName)){
            byte[] buffer = new byte[1024];
            int byteRead;
            while((byteRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, byteRead);
            }
        }

    }

    public void print() throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
    }

    public void copy() throws IOException {
        FileWriter fw = new FileWriter("Exercises/Main6_copy.txt");
        PrintWriter pw = new PrintWriter(fw);

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            pw.println(line);
        }

        pw.close();
        br.close();

    }

    public void delete() throws IOException{
       // Path filePath = Path.of(fileName);
        Files.delete(Path.of(fileName));
    }
}
