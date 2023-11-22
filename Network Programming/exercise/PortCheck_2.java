package exercise;

import java.io.IOException;
import java.net.Socket;

public class PortCheck_2 {

    package exercise;

import java.io.IOException;
import java.net.Socket;

public class PortCheck_2 {
    public static void main(String[] args) {
        String host = "localhost"; // 확인할 호스트
        int startPort = 1; // 시작 포트 번호
        int endPort = 65535; // 끝 포트 번호

        for (int port = startPort; port <= endPort; port++) {
            try (Socket socket = new Socket(host, port)) {
                System.out.println("포트 " + port + "번이 열려 있습니다.");
                break;
            } catch (IOException ignored) {
                // 포트가 닫혀 있는 경우 무시
            }
        }
    }
}


    // public static void main(String[] args) {
    //     int startPort = 0;
    //     int endPort = 65535;

    //     if (args.length < 2) {
    //         System.err.println("검색할 포트 범위 지정이 필요합니다.");
    //     }

    //     try {
    //         startPort = Integer.parseInt(args[1]);
    //         endPort = Integer.parseInt(args[0]);

    //         if (endPort < startPort) {
    //             int temp = startPort;
    //             startPort = endPort;
    //             endPort = temp;
    //         }
    //     } catch (NumberFormatException e) {
    //         System.err.println("포트 올바르지 않습니다.");
    //     }

    //     for (int port = startPort; port < endPort; port++) {
    //         // try-with-resources
    //         try (Socket socket = new Socket("localhost", port)) {
    //             System.out.println("Port " + port + " 열려 있습니다.");
    //             socket.close();
    //         } catch (IOException ignore) {
    //         }
    //     }
    // }
    
// }
