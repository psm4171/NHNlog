package min.Thread.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Item> items = new ArrayList<>();
    private int MAX_ITEMS = 10;
    int customerCount;
    int supplierCount;

    int customerId;
    int supplierId;

    String item;

    Customer customer = new Customer();

    public Store() {
        this.items = items;
        this.customerCount = 0;
    }

    public void enter(Customer customer) throws InterruptedException {


        while (customerCount < 5) {
            try {
                // wait();
                customerCount++;
                String name = Thread.currentThread().getName();
                System.out.println(name + "이(가) 입장했습니다.");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (customerCount == 5) {
            Thread.sleep(300);
            System.out.println("더이상 매장에 입장 불가능합니다! ");
        }

    }

    public void exit(Customer customer) throws InterruptedException {

         String name = Thread.currentThread().getName();
        System.out.println(name + "이(가) 매장에서 퇴장했습니다.");
        customer.setExitRequested(true);

        notifyAll();

    }

    public synchronized void enterProducer() {
        while (supplierCount >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        supplierCount++;
    }

    public synchronized void exitProducer() {
        supplierCount--;
        notifyAll();
    }

    public synchronized void deliverItem(int supplierId) {
        while (items.size() == 0) {
            try {
                wait();
                System.out.println("상점에 물품이 물건이 없습니다. 기다려주세요");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


        notifyAll(); // 다른 소비자나 생산자에게 알림
    }


    public synchronized void buy(String item) throws InterruptedException {


            try {
                //    String name = Thread.currentThread().getName();
                //     System.out.println(name + "은 기다립니다.");
                String name = Thread.currentThread().getName();
                System.out.println(name + "이(가) "+ item +"을 구매합니다.");
//                System.out.println("남은 물건 : " + items.size() + "개");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        items.remove(items);
        notify();
    }


    public synchronized void sell() {

        while (true) {
            for (int i = 0; i < items.size(); i++) {
                if (items.equals(items.get(i))) {
                    items.remove(i);
                    notify();
                    return;
                }
            }
        }
        // notifyAll(); // 다른 소비자나 생산자에게 알림
    }
}

//    public synchronized void deliver(){
//        if(maxItemCount < 10){
//            maxItemCount++;
//            System.out.println("물건이 들어왔습니다.");
//        }else {
//            System.out.println("매장에 물건이 가득있습니다. ");
//        }
//    }

