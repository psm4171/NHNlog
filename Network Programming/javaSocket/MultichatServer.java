package javaSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MultichatServer {

    HashMap clients;

    MultichatServer() {
        clients = new HashMap<>();
        Collections.synchronizedMap(clients);
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(4171);
            System.out.println("서버가 열림.");

            while (true) {
                socket = serverSocket.accept();
                System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] 에 접속됨.");
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }

        } catch (IOException e) {
            System.err.println("오류");
        }
    }

    public void sendToAll(String msg) {
        Iterator it = clients.keySet().iterator();

        while (it.hasNext()) {
            try {
                DataOutputStream out = (DataOutputStream) clients.get(it.next());
                out.writeUTF(msg);
            } catch (IOException e) {
            }
        }
    }

    public static void main(String[] args) {
        new MultichatServer().start();
    }

    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;


        ServerReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

           // clients = new HashMap<>();
            Collections.synchronizedMap(clients);
        }

        public void run() {
            String name = "";
            try {
                name = in.readUTF();
                sendToAll(name + "님이 입장.");
                clients.put(name, out);
                System.out.println("현재 접속자 수 : " + clients.size());

                while (in != null) {
                   sendToAll(in.readUTF());
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                sendToAll(name + "님이 퇴장,");
                clients.remove(name);
                System.out.println(socket.getInetAddress() + ":" + socket.getLocalAddress() + "에서 접속을 종료!");
                System.out.println("현재 서버 접속자 수는 : " + clients.size());
            }
        }


    }
}
