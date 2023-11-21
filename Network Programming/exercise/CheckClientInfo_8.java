package exercise;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CheckClientInfo_8 {
//    public static void main(String[] args) throws IOException {
//        int port = 8888;
//
//
//        try{
//            if(args.length > 0){
//                port = Integer.parseInt(args[0]);
//            }
//        }catch (NumberFormatException e){
//            System.err.println("1~65535까지의 포트번호만 가능");
//        }
//
//        try(ServerSocket serverSocket = new ServerSocket(port);
//            Socket socket = serverSocket.accept()) {
//            System.out.println("연결에 성공.");
//            System.out.println(socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "가 연결됨.");
//            System.out.println(socket.getLocalAddress());
//            //getInetAddress - 클라이언트와 연결된 서버 소켓의 원격 ip
//            //getLocalAddress - 현재 시스템에서 실행 중인 소켓의 ip
//            System.out.println("연결 해제");
//        }catch (IOException e){
//            System.out.println("서비스 열기에 실패.");
//        }
//    }

    public static void main(String[] args) {
        int port = 8888;
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignore) {
                System.err.println("Port는 0 ~ 65535 까지의 정수만 가능합니다.");
                System.exit(1);
            }
        }

        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket socket = serverSocket.accept()) {
            System.out.println(socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "가 연결되었습니다.");
            System.out.println("연결을 끊습니다.");
        } catch (IOException ignore) {
            System.out.println("서비스 열기에 실패 하였습니다.");
        }
    }

    }
