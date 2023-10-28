package min.Thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam01 {
    // 10개의 thread가 시작 메시지를 출력하고, 2초간 대기 후 종료 메시지를 출력하도록 thread pool을 구성해보자.
    public static void main(String[] args) {
        // Thread pool(executor) 객체를 생성
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            executor.submit(new Worker("Worker" + i));
        }

        executor.shutdown(); // Thread pool 종료
        while(!executor.isTerminated()){

        }

        System.out.println("모든 작업이 완료됨. ");
    }
}
