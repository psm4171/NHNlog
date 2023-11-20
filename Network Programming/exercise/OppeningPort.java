package exercise;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import java.net.Socket;

public class OppeningPort {
    public static void main(String[] args) {
        int startPort = 0;
        int endPort = 65535;

        if (args.length < 2) {
            System.err.println("검색할 포트 범위 지정이 필요합니다.");
        }

        try {
            startPort = Integer.parseInt(args[0]);
            endPort = Integer.parseInt(args[1]);

            if (endPort < startPort) {
                int temp = startPort;
                startPort = endPort;
                endPort = temp;
            }
        } catch (NumberFormatException e) {
            System.err.println("포트가 올바르지 않습니다.");
        }

        for (int port = startPort; port < endPort; port++) {
            try {
                // tag::createSocket[]
                Socket socket = new Socket("localhost", port);
                System.out.println("Port " + port + " 열려 있습니다.");
                socket.close();
                // end::createSocket[]
            } catch (Exception ignore) {
                //
            }
        }
    }
}