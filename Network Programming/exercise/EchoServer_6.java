package exercise;

import java.io.*;
import java.net.Socket;

class EchoServer_6{
    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int port = 1234;

        if(args.length > 0){
            host = args[0];
        }

        try {
            if(args.length > 1){
                port = Integer.parseInt(args[1]);
            }
        }catch (NumberFormatException e){
            System.err.println("포트가 올바르지 않습니다.");
            System.exit(1);
        }

        try(Socket socket = new Socket(host, port)){
            BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter socketOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader terminalIn = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter terminalOut = new BufferedWriter(new OutputStreamWriter(System.out));

            System.out.println("서버에 연결됨.");

            String line;

            while((line = terminalIn.readLine()) != null){
                socketOut.write(line + "\n");
                socketOut.flush();

                if(line.equals("exit")){
                    break;
                }

                line = socketIn.readLine();
                terminalOut.write(line + "\n");
                terminalOut.flush();



            }
        }catch (IOException e){
            System.out.println("연결에 실패했습니다.");
        }
    }
}