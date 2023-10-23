package min.Thread.synchronization.exam03;

public class SharedCount {
    static int count;

    SharedCount(){

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SharedCount.count = count;
    }

    public static synchronized void increment(){ // static instance를 생성하고, synchronized keyword를 사용하여 해결
        count++;
    }
}
