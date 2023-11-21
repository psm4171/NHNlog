package exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class ServreInputExit_5 {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;

        if(args.length > 0) {
            host = args[0];
        }
        try {
            if(args.length > 1){
                port = Integer.parseInt(args[1]);
            }
        }catch (NumberFormatException e){
            System.err.println("포트가 올바르지 않습니다. ");
            System.exit(1);
        }

        try {
            Socket socket = new Socket(host, port);
            System.out.println("서버에 연결됨.");
            BufferedInputStream input = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream());

            byte[] buffer = new byte[1024];
            int readLength;
            while((readLength = input.read(buffer)) > 0){
                if(new String(buffer, 0, readLength).trim().equals("exit")){
                    System.out.println("서버에서 연결을 해제합니다. ");
                    break;
                }
            }

            output.write(buffer, 0, readLength);


        } catch (ConnectException e) {
            System.err.println("서버에 연결할 수 없습니다.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
