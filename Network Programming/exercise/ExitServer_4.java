package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

public class ExitServer_4 {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;

        try {
            if (args.length > 1) {
                port = Integer.parseInt(args[1]);
            }
        }catch (NumberFormatException ignore){
            System.err.println("포트가 올바르지 않습니다.");
            System.exit(1);
        }

        try {
            Socket socket = new Socket(host, port);
            System.out.println("서버에 연결되었습니다.");

            OutputStream outputStream = socket.getOutputStream(); // 소켓에서 출력을 나타냄
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 콘솔에서 입력

            while (true) {
                String line = br.readLine();
                if (line.equals("exit")) {
                    System.out.println("연결을 종료합니다. ");
                    break;
                }

                outputStream.write(line.getBytes()); // 콘솔에서 입력받은 문자열 전송
                outputStream.write("\n".getBytes());
                outputStream.flush(); // buffer에 남아있는 데이터까지 완전히 전송

            }

            socket.close();

        }catch (ConnectException ex) {
                System.err.println(host + ":" + port + "에 연결할 수 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
