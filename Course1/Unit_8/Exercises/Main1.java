package Exercises;

import java.io.*;

public class Main1 {
    public static String[] loadArray(InputStream is, int n) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String[] input = new String[n];

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            input[i] = line;
        }
        return input;
    }

    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));

        for(String s: sa){
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        String[] input = {"Hi", "Park", "How are you?"};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        saveArray(outputStream, input);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        String[] loadedStrings = loadArray(inputStream, input.length);

        for (String str : loadedStrings) {
            System.out.println(str);
        }
    }
}
