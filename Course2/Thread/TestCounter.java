package Thread;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter("Counter1");
        Counter counter2 = new Counter("Counter2");

        CounterThread counterThread1 = new CounterThread("CounterThread1");
        CounterThread counterThread2 = new CounterThread("CounterThread2");

        // 1-2
//        counter1.run();
//        counter2.run();

        // 1-4
//        counterThread1.start();
//        counterThread2.start();

        // 1-5
        counterThread1.start();
        counter1.run(); // run은 싱글 스레드라서 싱글 스레드가 완전히 종료된 후 멀티 스레드가 실행되므로
        // run() -> start() 순서로 실행 시키면 멀티 스레드

    }
}
