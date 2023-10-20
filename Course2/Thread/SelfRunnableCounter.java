package Thread;

public class SelfRunnableCounter implements Runnable{
    int count;
    int maxCount;
    Thread thread;

    public SelfRunnableCounter(String name, int maxCount){
        this.maxCount = maxCount;
        count = 0;
        thread = new Thread(this, name);
    }

    public void start(){
        thread.start();
    }


    @Override
    public void run() {
        while(count < maxCount){
            try {
                ++count;
                System.out.println(thread.getName() + " : " + count);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        SelfRunnableCounter counter = new SelfRunnableCounter("selfCounter", 5);
        counter.start(); // 내부적으로 thread.start()가 호출된다.
        // Thread 클래스의 start()는 새로운 스레드를 생성하고, 해당 스레드에서 run() 메서드를 실행한다.
        // 따라서 SelfRunnableCounter 클래스에서도 thread.start()가 호출되면 새로운 스레드가 생성되고 run()이 실행



    }
}
