package javaSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultichatClient2 {
    public static void main(String[] args) {

        int port = 4171;
        if (args.length != 1) {
            System.out.println("USAGE: java MultichatClient ");
            System.exit(1);
        }

        try {

            String serverIp = "127.0.0.1";
            Socket socket = new Socket(serverIp, port);
            System.out.println("서버에 연결됨.");
            Thread sender = new Thread(new ClientSender2(socket, args[0]));
            Thread receiver = new Thread(new ClientReceiver2(socket));

            sender.start();
            receiver.start();

        } catch (ConnectException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class ClientReceiver2 extends Thread{
        Socket socket;
        DataInputStream in;
        ClientReceiver2(Socket socket) {
            this.socket = socket;

            try{
                in = new DataInputStream(socket.getInputStream());

            }catch (IOException e){}
        }

        public void run(){
            while( in != null){
                try{
                    System.out.println(in.readUTF());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class ClientSender2 extends Thread{
        Socket socket;
        DataOutputStream out;
        String name;
        public ClientSender2(Socket socket, String name) {
            this.socket = socket;
            try {
                out = new DataOutputStream(socket.getOutputStream());
                this.name = name;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void run(){
            Scanner sc = new Scanner(System.in);
            try{
                if(out != null){
                    out.writeUTF(name);
                }

                while( out != null){ // 메세지 입력하는 부분
                    out.writeUTF(name + " : " + sc.nextLine());
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}


