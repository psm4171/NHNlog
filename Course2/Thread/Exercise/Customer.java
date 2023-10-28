package min.Thread.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Thread {
    private Store store;
    private String item;
    private List<Item> items = new ArrayList<Item>();

    private boolean exitRequested = false;

    String customerName;

    public String getCustomerName() {
        return customerName;
    }

    int customerCount;
    int customerId;

    Thread thread;

    public Customer(Store store, String item) {
        this.store = store;
        this.item = item;
         thread = new Thread(this, item);
    }

    public Customer() {

    }

    @Override
    public void run() {
        try {
            store.enter(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            store.buy(item);
         //  String name = Thread.currentThread().getName();
           // customerName = Thread.currentThread().getName();
          //  System.out.println(name + "이(가) " + item + "를 구매합니다.");
            Thread.sleep(500);
            items.remove(item);
            System.out.println(customerName + "이 물건을 구매한 후 퇴장했습니다. ");
            store.exit(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public synchronized boolean isExitRequested(boolean b) {
        return exitRequested;
    }

    public void setExitRequested(boolean exitRequested) {
        this.exitRequested = exitRequested;
    }
}

//    public void start(){
//        thread.start();
//    }


