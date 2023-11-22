package exercise;

import java.io.*;
import java.net.Socket;

public class BroadcastingClient_13 {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 1234;

        try(Socket socket = new Socket(host, port)){
            //PrintWriter out = new PrintWriter(socket.getOutputStream()); // 서버에 데이터 전송
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버로부터 데이터를 받음

            BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in)); // 사용자로부터 키보드로 입력받는 스트림

            System.out.println("서버에 연결됨.");

            String inputUser;

            while((inputUser = userIn.readLine()) != null){
                System.out.println("메세지를 보냅니다. ");
                writer.write(inputUser);
                writer.newLine();
                writer.flush();
                System.out.println("서버로부터 받은 메세지 : " + in.readLine());
            }
        }catch (IOException e){
            System.err.println("네트워크 오류 발생");
        }
    }

    /*
    * package exercise;

import java.io.*;
import java.net.Socket;

public class BroadcastingClient_13 {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 1234;

        try(Socket socket = new Socket(host, port)){
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("서버에 연결됨.");

            String inputUser;

            while((inputUser = userIn.readLine()) != null){
                writer.write(inputUser);
                writer.newLine(); // 줄 바꿈 문자를 추가합니다. 이 문자가 없으면 서버는 메시지의 끝을 알 수 없습니다.
                writer.flush(); // 버퍼에 남아있는 데이터를 즉시 전송합니다.
                System.out.println("서버로부터 받은 메시지 : " + in.readLine());
            }
        }catch (IOException e){
            System.err.println("네트워크 오류 발생");
        }
    }
}
    *
    * */
}
