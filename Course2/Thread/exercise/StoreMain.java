package min.Thread.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import min.Thread.Counter;

public class StoreMain {
    public static void main(String[] args) throws InterruptedException {

        Store store = new Store();
      //  store.enter(this);

        new Thread(new Customer(store, "아메리카노"), "고객 a").start();
        new Thread(new Customer(store, "카페라떼"), "고객 b").start();
        new Thread(new Customer(store, "아인슈페너"), "고객 c").start();
        new Thread(new Customer(store, "카푸치노"), "고객 d").start();
        new Thread(new Customer(store, "카푸치노"), "고객 e").start();


        Supplier supplier1 = new Supplier(store, 1);
        supplier1.start();
       // supplier1.run();

        for (int i = 0; i < 2; i++) {
            Supplier supplier = new Supplier(store, i);
            supplier.start();
        }

    }
}
