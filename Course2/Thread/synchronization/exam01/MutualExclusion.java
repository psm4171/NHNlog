package min.Thread.synchronization.exam01;

public class MutualExclusion extends Thread{
    private static int counter = 0;
    private static Object lock = new Object();

    public void run(){
        for(int i = 0; i < 100000; i++){
            synchronized (lock){
                counter++;// 동기화 참조변수에 lock을 선언해줌으로써 thread1이 먼저 실행되고 종료되기까지의 일관성을 부여
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MutualExclusion thread1 = new MutualExclusion();
        MutualExclusion thread2 = new MutualExclusion();


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter : " + counter);
    }
}
