package Exercises;

import java.io.*;

public class Apartment {
    private int size;
    private String address;
    private String[] resident;
    private int numberOfResidents;

    private String fileName;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        resident = new String[10];
        this.numberOfResidents = 0;

    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addResident(String name) {
        if (numberOfResidents <= 10) {
            resident[numberOfResidents] = name;
            numberOfResidents++;
        }
    }

    // 번호에 해당하는 이름
    public String residentByNum(int num) {
        if (num >= 0 && num < numberOfResidents) {
            return resident[num];
        } else {
            return null;
        }
    }

    public void removeResident(int num) {
        if (num >= 0 && num < numberOfResidents) {
            for (int i = num; i < numberOfResidents - 1; i++) {
                resident[i] = resident[i + 1];
            }
            resident[numberOfResidents - 1] = null;
            numberOfResidents--;
        }
    }

    public String[] getResident() {
        return resident;
    }

    public void saveTofile(String fileName) throws IOException {

       FileWriter fw = new FileWriter(fileName, true);
       PrintWriter pw = new PrintWriter(fw);

       pw.println("평 수 " + size);
       pw.println("주소 " + address);


        pw.println("거주자 명단");
       for(String info : resident){
           pw.print(info + " ");
       }
       pw.println();

       pw.close();
       fw.close();

    }

    public static Apartment readFromFile(BufferedReader br) throws IOException {

        int size = Integer.parseInt(br.readLine());
        String address = br.readLine();
        int numberOfResidents = Integer.parseInt(br.readLine());
        String[] resident = br.readLine().split(" ");

        Apartment apartment = new Apartment(size, address);

        for(String info : resident){
            apartment.addResident(info);
        }

        return apartment;

    }

    public static void printApartmentsFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fr);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

    }

    @Override
    public String toString() {

        StringBuilder info = new StringBuilder();
        info.append("평 수 : ").append(size).append("\n");
        info.append("주소 : ").append(address).append("\n");
        info.append("거주자 수 : ").append(getNumberOfResidents()).append("\n");
        info.append("거주자 명 \n");
        for (int i = 0; i < numberOfResidents; i++) {
            info.append(i + 1).append("층 : ").append(resident[i]).append("\n");
        }
        return info.toString();
    }

    public static void main(String[] args) throws IOException {
        Apartment apt1 = new Apartment(15, "Seoul");
        Apartment apt2 = new Apartment(9, "Gwangu");
        apt1.addResident("박가나");
        apt1.addResident("오나라");
        apt2.addResident("김다라");

        System.out.println(apt1);
        System.out.println(apt2);


        apt1.saveTofile("Exercises/Main8_apt.txt");
        apt2.saveTofile("Exercises/Main8_apt.txt");

        Apartment.printApartmentsFromFile("Exercises/Main8_apt.txt");


    }

}
