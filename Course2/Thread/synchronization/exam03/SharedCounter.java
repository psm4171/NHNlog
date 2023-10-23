package min.Thread.synchronization.exam03;

import min.Thread.synchronization.exam03.SharedCount;

public class SharedCounter extends Thread{


   // SharedCount sharedCount;
    int count;
    int maxCount;

    public SharedCounter(){

    }

    public SharedCounter(String name, int maxCount){
        setName(name);
        this.maxCount = maxCount;
        count = 0;
    }


    @Override
    public void run(){
        while (count < maxCount) {
            count++;
            SharedCount.increment();
        }

    }
}
