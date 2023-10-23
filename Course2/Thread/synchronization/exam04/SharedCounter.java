package min.Thread.synchronization.exam04;

import min.Thread.synchronization.exam04.SharedCount;

public class SharedCounter extends Thread{


    SharedCount sharedCount;
    int count;
    int maxCount;

    public SharedCounter(){

    }

    public SharedCounter(String name, int maxCount, SharedCount sharedCount){
        setName(name);
        this.maxCount = maxCount;
        this.sharedCount = sharedCount;
        count = 0;
    }


    @Override
    public void run(){
        while (count < maxCount) {
            count++;
            synchronized (sharedCount){ // SharedCount object와 synchronized code block을 이용해 해결
                sharedCount.increment();
            }
        }

    }
}
