package min.Thread.daemon;

import min.Thread.pool.Worker;

public class Exam02 {
    // User thread와 daemon thread를 생성한다. 단, daemon thread는 user thread 안에서 실행하도록 수정한 후 실행 종료 후 thread의 상태를 확인 하자

    public static void main(String[] args) throws InterruptedException {
        WorkerDaemon worker = new WorkerDaemon("worker1", 100);
        worker.start();

        Thread.sleep(5000);
        worker.stop();

        System.out.println("Main thread terminated");
    }

}
