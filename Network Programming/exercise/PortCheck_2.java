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

