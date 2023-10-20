package min.Thread;

public class RunnableCounter {
    String name;
    int count;

    public RunnableCounter(String name, int count){
        this.name = name;
        this.count = count;
    }
    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter("Counter", 5);
        Thread thread = new Thread(counter);
        thread.start();

    }
}
