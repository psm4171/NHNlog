package min.Thread.synchronization.exam02;

public class SharedCount {
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void increment(){ // 동적으로 생성된 instance variable에 적용
        setCount(getCount() + 1);
    }
}
