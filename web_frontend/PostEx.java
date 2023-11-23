import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostEx {
    public static void main(String[] args) throws IOException {
        String url = "https://httpbin.org/post";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("POST");
        con.setDoOutput(true);

        String postData = "age=30&id=marco&no=1";

        try(OutputStream os = con.getOutputStream()){
            byte[] input = postData.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = con.getResponseCode();
        System.out.println("POST 요청 응답 코드 : " + responseCode);

        try(BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String input;
            StringBuffer response = new StringBuffer();

            while((input = in.readLine()) != null){
                response.append(input);
            }
            System.out.println("POST 요청 출력 : " + response.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
