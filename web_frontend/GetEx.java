import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetEx {
    public static void main(String[] args) {
        try{
            String url = "https://httpbin.org/get?param1=value1&param2=value2";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET"); // HTTP GET 메서드

            int responseCode = con.getResponseCode();
            System.out.println("GET 요청 응답 코드 : " + responseCode);

            // 응답 읽기
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String input;
            StringBuffer response = new StringBuffer();

            while((input = in.readLine()) != null){
                response.append(input);
            }
            in.close();

            System.out.println("GET 응답 출력 : " + response.toString());


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
