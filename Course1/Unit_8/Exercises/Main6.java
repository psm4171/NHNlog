package Exercises;

import java.io.IOException;
public class Main6 {
    public static void main(String[] args) {
        String fileName = "/Exercises/Main6_origin.txt";
        IOFile ioFile = new IOFile(fileName);

        try {
            int lineCount = ioFile.countLines();
            System.out.println("줄의 개수 " + lineCount);

            System.out.println("파일 목록 : ");
            ioFile.print();

            String copyFile = "Exercises/Main6_copy.txt";
            ioFile.copy(copyFile);
            System.out.println("복사한 파일 : " + copyFile);

            ioFile.delete();
            System.out.println("삭제된 파일명 : " + fileName);

        } catch (IOException e){
            e.printStackTrace();
        }



    }
}
