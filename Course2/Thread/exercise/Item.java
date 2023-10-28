package min.Thread.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Item {

    List<Item> items = new ArrayList<>();

    final int MAX_THING = 5;
    private String name;
    int itemCount = 0;

    public Item(String name, int itemCount){
        this.name = name;
      //  this.itemCount++;
        this.itemCount = itemCount;
    }

    public String getName() {
        return name;
    }

    public void add(Item item){
        // lock.lock();
        while(items.size() < MAX_THING){
            items.add(item);
//            System.out.println("물건을 살 동안 다른 " + customer.getName() + "은(는) 기다립니다. " );
            if(items.size() > MAX_THING){
                return;
            }

        }

    }

}
