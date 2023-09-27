package Exercises;

import java.io.*;

public class HandleBAs {

    private String fileName;
    private String ownerName;
    private double balance;
    public HandleBAs(String fileName)  throws IOException {

        this.fileName = fileName;
        BufferedReader br = new BufferedReader(new FileReader(fileName));
    //22
        this.ownerName = br.readLine();
        this.balance = Double.parseDouble(br.readLine());

        br.close();
    }

        public void interests(double rate) throws IOException {
            this.balance += balance * rate;
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(ownerName + '\n');
            bw.write(String.valueOf(balance));

            bw.close();
        }

        public void printNegative() throws IOException {
            System.out.println("Print accounts with Balance:");

            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }


    public static void main(String[] args) throws IOException {
        String fileName = "Exercises/Main7_bank.txt";
        HandleBAs handleBAs = new HandleBAs(fileName);

        handleBAs.printNegative();
        handleBAs.interests(3.5);
        handleBAs.printNegative();
    }
}

