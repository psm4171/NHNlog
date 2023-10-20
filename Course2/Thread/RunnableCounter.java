package Thread;

import static java.lang.Thread.sleep;

public class RunnableCounter implements Runnable{
    private String name;
    private int count;

    public boolean isRunning;

    public RunnableCounter(String name, int count){
        this.name = name;
        this.count = count;
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void run() {
        isRunning = true;
//                for(int i = 0; i < 15; i++) {
//                    count++;
//                    // System.out.print(isRunning + "_");
//                    System.out.println("Thread 상태 : " + isRunning + ", " + this.name + " : " + count);
//
//                }

                while(isRunning){
                    ++count;
                    System.out.println("Thread 상태 : " + isRunning + ", " + this.name + " : " + count);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignore) {
                        Thread.currentThread().interrupt();
                        isRunning = false;
                        System.out.println("Thread 상태 : " + isRunning());
                        break;
                    }

//                    try{
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
        isRunning = false;
    }


    public void setQuit () {
        isRunning = false;
    }

    public static void main(String[] args) throws InterruptedException {

        RunnableCounter counter1 = new RunnableCounter("Counter1", 0);
        Thread thread1 = new Thread(counter1);

       // System.out.println("Thread 상태 : " + counter1.isRunning());

        thread1.start();
        Thread.sleep(5000);

        thread1.interrupt();

        try {
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        RunnableCounter counter2 = new RunnableCounter("Counter2", 0);
        Thread thread2 = new Thread(counter2);

        thread2.start();
        System.out.println("-----Thread2 시작-----");
        Thread.sleep(3000);
        counter2.setQuit();

        System.out.println("Thread 상태 : " + counter2.isRunning());


    }
}
