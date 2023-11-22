package exercise;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BroadcastingServer_12 {

    private static List<PrintWriter> clientWriters = new ArrayList<>();

    public static void participateClient(Socket socket){

//        try(BufferedInputStream input = new BufferedInputStream(socket.getInputStream());
//            BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream())){
//
//            System.out.println("클라이언트가 접속됨.");
//
//            byte[] buffer = new byte[1024];
//            int length;
//
//            while((length = input.read(buffer)) > 0){
//                output.write(buffer, 0, length);
//                output.flush();
//
//                // BufferedWriter writer = new BufferedWriter(socket.getOutputStream());
//                BufferedReader termIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                String clientRequest = new String(buffer, 0, length);
//                System.out.println("클라이언트로부터 받은 데이터 : " + clientRequest);
//                //sendMessage();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        PrintWriter writer = null;

        try{
            writer = new PrintWriter(socket.getOutputStream(), true);
            synchronized (clientWriters){
                clientWriters.add(writer);
            }

            BufferedInputStream input = new BufferedInputStream(socket.getInputStream());
            byte[] buffer = new byte[1024];
            int length;

            while((length = input.read(buffer)) > 0){
                String clientRequest = new String(buffer, 0, length);
                System.out.println("클라이언트로부터 받은 메세지 : " + clientRequest);
                sendMessage("서버가 보내는 메세지 : " + clientRequest);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(writer != null){ // 접속 끝나면 리스트에서 제거
                synchronized (clientWriters){
                    clientWriters.remove(writer);
                }
            }
        }

    }

    private static void sendMessage(String message) {
        Scanner sc = new Scanner(System.in);
        message = sc.next();
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
            writer.flush();
        }
    }


    public static void main(String[] args) {
        int port = 1234;

        try{
            if(args.length > 0 ) port = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            System.err.println("포트는 0 ~ 65535 사이입니다.");
            System.exit(1);
        }


        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("서버가 열렸습니다.");

            while(true){
               Socket socket = serverSocket.accept();
                Thread participateClient = new Thread(()-> {
                    participateClient(socket);
                });
            participateClient.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
