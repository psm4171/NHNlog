package Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOFile {
    private static String fileName;

    public IOFile(String fileName){
        this.fileName = fileName;
    }

    public int countLines() throws IOException{
        int lineCount = 0;

       try (BufferedReader br = new BufferedReader(new FileReader(fileName))){

           while (br.readLine() != null) {
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

    public void print() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }

    }

    public void copy(String newFileName) throws IOException {
        Path original = Path.of(fileName);
        Path copya = Path.of(newFileName);
        Files.copy(original, copya);

    }

    public static void delete() throws IOException {
        Path filePath = Path.of(fileName);
        Files.delete(filePath);

    }

}
