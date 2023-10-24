package min.Thread.state.quiz;

public class quiz02 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter thread1 = new RunnableCounter("Thread 1", 10, 15);
        RunnableCounter thread2 = new RunnableCounter("Thread 2", 10, 15);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("All threads stopped");


    }
}
