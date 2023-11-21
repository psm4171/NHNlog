package exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer_Server_9 {
    public static void main(String[] args) throws IOException {

        int port = 9999;
        int bufferSize = 2048;

        if(args.length > 0){
            try{
                port = Integer.parseInt(args[0]);

            }catch (NumberFormatException ignore){
                System.err.println("포트는 0~65535까지 가능합니다.");
                System.exit(1);
            }
        }

        try(ServerSocket serverSocket = new ServerSocket(port)){
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트와 연결됨. ");
            BufferedInputStream socketIn = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream socketout = new BufferedOutputStream(socket.getOutputStream());

            byte[] buffer = new byte[bufferSize];
            int length;

            while((length = socketIn.read(buffer)) > 0){
                socketout.write(buffer, 0, length);
                socketout.flush();

                String clientRequest = new String(buffer, 0, length);
                System.out.println("클라이언트로부터 받은 데이터 : " + clientRequest);
            }

        }catch (IOException e){
            System.err.println("서비스 열기에 실패!");
        }
    }
}
