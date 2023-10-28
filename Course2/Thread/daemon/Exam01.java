package min.Thread.daemon;

public class Exam01 {

    // User thread와 daemon thread를 생성하고, 일정 시간 후 main thread를 종료한 후 thread의 상태를 확인 하자
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 100);
        RunnableCounter counter2 = new RunnableCounter("counter2", 100);

        counter2.setDaemon(true); // daemon Thread로 설정.

        counter1.start();
        counter2.start();

        Thread.sleep(5000);
        counter1.stop();

        System.out.println("Main thread terminated");

    }
}
