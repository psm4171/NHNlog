package Exercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main6 {
    public static  void main(String[] args) throws IOException, ExceptionLineTooLong{
        String fileName = "Exercises/Main6.txt";
        IOFile ioFile = new IOFile(fileName);

        try {

            int lineCount = ioFile.countLines();
            System.out.println("줄의 개수 : " + lineCount);
            if(lineCount == 0){
                throw new FileNotFoundException();
            }
            else if (lineCount > 80){
                throw new ExceptionLineTooLong("Exception Line Too Long !");
            }

            System.out.println("파일 목록 : ");
            ioFile.print();

            System.out.println();
            System.out.println("복사된 파일 내용");
            ioFile.copy();
            ioFile.print();

//            ioFile.delete();
//            System.out.println("삭제된 파일명 : " + fileName);

        }catch (FileNotFoundException e){
            System.out.println("File contents not found!");
        }catch (ExceptionLineTooLong e ){
            System.out.println("Exception Line Too Long !" + e.getMessage());
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
