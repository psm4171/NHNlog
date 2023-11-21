package exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClient_11 {

    public static void handleClient(Socket socket) throws IOException {
        try(  BufferedInputStream input = new BufferedInputStream(socket.getInputStream());
              BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream())){

            System.out.println("클라이언트가 접속됨.");

            byte[] buffer = new byte[1024];
            int length;

            while((length = input.read(buffer)) > 0){
                output.write(buffer, 0, length);
                output.flush();
            }

            System.out.println("클라이언트와의 연결이 종료됨.");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;

        if(args.length > 0) host = args[0];

        try{
            if(args.length > 1) port = Integer.parseInt(args[1]);

        }catch (NumberFormatException e){
            System.err.println("포트는 0~65545까지 정수만 가능!");
            System.exit(1);
        }

        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("서버가 열렸습니다.");

            while(true){

                Socket socket = serverSocket.accept();
                Thread clientHanler = new Thread(() -> {
                    try {
                        handleClient(socket);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                clientHanler.start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
