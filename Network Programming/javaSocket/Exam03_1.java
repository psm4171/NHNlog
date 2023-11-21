package javaSocket;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class Exam03_1 {
    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int port = 4171;
        Scanner sc = new Scanner(System.in);

        try(Socket socket = new Socket(host, port)) {
            System.out.println("서버에 연결됨");

            while(true){
                System.out.print("텍스트 입력 : ");
                String text = sc.nextLine();
                StringBuilder sb = new StringBuilder(text);
                sb.append("\n");
                socket.getOutputStream().write(sb.toString().getBytes());

                if(Objects.equals(text, "exit")){
                    System.out.println("서버 연결을 종료합니다. ");
                    break;
                }
                System.out.println();
            }
        }catch (ConnectException e){
            System.err.println(e);
        }
    }
}
