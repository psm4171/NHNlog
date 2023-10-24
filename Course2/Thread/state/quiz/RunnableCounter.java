package min.Thread.state.quiz;

public class RunnableCounter implements Runnable{

    Thread thread;
    String name;
    int count;
    int maxCount;
    long interval = 100;

    public RunnableCounter(String name, int count, int maxCount){
        thread = new Thread(this, name);
        this.name = name;
        this.count = count;
        this.maxCount = maxCount;
    }

    public void run() {
        while(count < maxCount){
            try{
                count++;
                Thread.sleep(interval);
                System.out.println(this.name + " : " + count);

            }catch(InterruptedException ignore){
                Thread.currentThread().interrupt();

            }
        }
    }

    public void start() {
        thread.start();
    }

    public void join() throws InterruptedException {
        thread.join();
        System.out.println( this.name + " stopped");
    }
}
