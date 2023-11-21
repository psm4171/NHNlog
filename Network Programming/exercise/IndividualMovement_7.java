package exercise;

import java.io.*;
import java.net.Socket;
import java.util.regex.Pattern;

public class IndividualMovement_7 {
    static class Receiver extends Thread{

        BufferedReader inputThread;

        public Receiver(BufferedReader inputThread){
            this.inputThread = inputThread;
        }

        @Override
        public void run() {
            char[] buffer = new char[2048];

            try {
                while ((!Thread.currentThread().isInterrupted())){
                    int length;
                    length = inputThread.read(buffer);
                    System.out.println(new String(buffer, 0, length));
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 4444;

        if(args.length > 0){
            host = args[0];
        }

        try{
            if(args.length > 1){
                port = Integer.parseInt(args[1]);
            }
        }catch (NumberFormatException e){
            System.err.println("포트가 올바르지 않습니다.");
            System.exit(1);
        }

        try(Socket socket = new Socket(host, port)){
            BufferedReader termIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            System.out.println("서버에 연결됨.");

            Receiver receiver = new Receiver(input);
            receiver.start();

            String line;
            while((line = termIn.readLine()) != null){
                if(line.trim().equals("exit")){
                    break;
                }
                output.write(line);
                output.flush();
            }
        }catch (IOException e) {
            System.err.println(e);
        }
    }
}
