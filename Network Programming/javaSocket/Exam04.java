package javaSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam04 {
    public static void main(String[] args) throws IOException {
        int port = 1111;

        try(ServerSocket serverSocket = new ServerSocket(port)){
            Socket socket = serverSocket.accept();

            socket.getOutputStream().write("Hello!".getBytes());
            socket.getOutputStream().flush();

            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
