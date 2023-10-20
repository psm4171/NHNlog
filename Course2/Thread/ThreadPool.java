package Thread;
import static java.lang.Thread.sleep;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{
    private String name;
    private int count;


    public ThreadPool(String name, int count){
        this.name = name;
        this.count = count;
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println(this.name + " : " + count);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

//            try {
//                for(int i = 0; i < 5; i++) {
//                    count++;
//                    System.out.println(this.name + " : " + count);
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//


    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.execute(new RunnableCounter("Counter1", 0));
        RunnableCounter counter = new RunnableCounter("Counter2", 0);
        Thread thread = new Thread(counter);

        thread.start();

    }
}

