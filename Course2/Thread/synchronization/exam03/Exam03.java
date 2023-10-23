package min.Thread.synchronization.exam03;


public class Exam03 {

    //Exam-01에서 발생했던 race condition 문제를 static instance를 생성하고, syncrhronized keyword를 이용해 해결
    public static void main(String[] args) throws InterruptedException {
        SharedCount sharedCount = new SharedCount();
        SharedCounter counter1 = new SharedCounter("counter1", 10000);
        SharedCounter counter2 = new SharedCounter("counter2", 10000);

        counter1.start();
        counter2.start();
        System.out.println(counter1.getName() + ": started");
        System.out.println(counter2.getName() + ": started");

        counter1.join();
        counter2.join();
        System.out.println(counter1.getName() + ": terminated");
        System.out.println(counter2.getName() + ": terminated");

        System.out.println("sharedCount : " + sharedCount.getCount());
    }
}
