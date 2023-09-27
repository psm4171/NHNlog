import java.io.IOException;

public class MainCar {
    public static void main(String[] args) {
        try {

            CarList carList = new CarList("cars.txt");
            Car newCar = new Car("kia", 2018, 140, 3000);
            carList.addCar(newCar);

            Car newCar2 = new Car("porche", 2023, 10, 500000);
            carList.addCar(newCar2);

            Car newCar3 = new Car("hundai", 2022, 100, 2000);
            carList.addCar(newCar3);

            Car expensiveCar = carList.mostExpensiveCar();
            if(expensiveCar != null) {
                System.out.println("Most expensive : " + expensiveCar.getModel());
            }else {
                System.out.println("No car List");
            }

            Car removeCar1 = new Car("kia", 2018, 140, 3000);
            carList.removeCar(removeCar1);

//            Car removeCar = new Car("Honda", 2022, 1500, 2000);
//            carList.removeCar(removeCar);

            int cntNewCar = carList.countNewCars();
            System.out.println("Number 0f new Car : " + cntNewCar);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
