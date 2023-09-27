import java.io.BufferedReader;
import java.io.IOException;

public class Car {
    private String model;
    private int year;
    private int kilo;
    private int price;

    public Car(String model, int year, int kilo, int price){
        this.model = model;
        this.year = year;
        this.kilo = kilo;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKilo() {
        return kilo;
    }

    public int getPrice() {
        return price;
    }

    public boolean equalTo(Car c) {
        return model.equals(c.model) && year == c.year && kilo == c.kilo
                && price == c.price;
    }

    public static Car read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if(s == null)
            return null;
        else
            return new Car(s, Integer.parseInt(br.readLine()),
                    Integer.parseInt(br.readLine()),
                    Integer.parseInt(br.readLine()));

    }



}
