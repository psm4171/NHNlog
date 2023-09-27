import java.io.*;

public class CarList {
    private String fileName;
    public CarList(String fn) {
        fileName = fn;
    }


    public int countNewCars() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int cnt = 0;
        Car c = Car.read(br);
        while(c != null) {
            if(c.getKilo() == 0)
                cnt++;
            c = Car.read(br);
        }
        br.close();
        return cnt;
    }


    public Car mostExpensiveCar() throws IOException {
        FileInputStream is = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        double max = 0;
        Car c = Car.read(br);
        Car cmax = null;
        int cnt = 0;
        while( c != null){
            if(c.getPrice() > max){
                max = c.getPrice();
                cmax = c;
            }
            c = Car.read(br);
        }
        br.close();
        return cmax;
    }

    public void addCar(Car c) throws IOException {

        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(c.getModel());
        pw.println(c.getYear());
        pw.println(c.getKilo());
        pw.println(c.getPrice());

        pw.close();
        fw.close();
    }

    public void removeCar(Car c) throws IOException {

        File f = new File(fileName);
        FileInputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        File ftemp = new File("cars-temporary.txt");
        FileOutputStream os = new FileOutputStream(ftemp);
        PrintWriter pw = new PrintWriter(os);

        Car current = Car.read(br);
        while(current != null){
            if(!current.equalTo(c)) {
                pw.println(current.getModel());
                pw.println(current.getYear());
                pw.println(current.getKilo());
                pw.println(current.getPrice());
            }
            current = Car.read(br);
        }

        br.close();
        pw.close();

        ftemp.renameTo(f);

    }

}
