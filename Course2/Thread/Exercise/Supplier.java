package min.Thread.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Supplier extends Thread{

    private List<Item> items = new ArrayList<>();
    private int itemMaxCount = 10;
    private int supplierId;
    private Store store;

    public Supplier(Store store, int supplierId){
        this.store = store;
        this.supplierId = supplierId;
    }

    public void run(Item item) {
        while (true) {
            store.deliverItem(supplierId);
            items.add(item);
        }
    }

}
