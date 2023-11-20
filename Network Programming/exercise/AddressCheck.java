package exercise;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class AddressCheck {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;

        if(args.length > 0) host = args[0];

        try {
            if (args.length > 1) {
                port = Integer.parseInt(args[1]);
            }
        }
        catch(NumberFormatException ignore){
            System.err.println("포트가 올바르지 않습니다.");
            System.exit(1);
        }

        try{
            Socket socket = new Socket(host, port);

            System.out.println("서버에 연결됨.");
            System.out.println("Local address : " + socket.getLocalAddress().getHostAddress());
            System.out.println("Local Port : " + socket.getLocalPort());
            System.out.println("Remote address : " + socket.getInetAddress().getHostAddress());
            System.out.println("Remote port : " + socket.getPort());

            socket.close();
        } catch (ConnectException e) {
            System.err.println(host + ":" + port + "에 연결할 수 없습니다.");
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
