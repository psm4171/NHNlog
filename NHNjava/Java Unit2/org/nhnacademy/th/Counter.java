package org.nhnacademy.th;

public class Counter {
    String name;
    int count;

    public Counter(String name, int count){
        this.name = name;
        this.count = 0;
    }


    public void run() {
        while (!Thread.interrupted()) {
            try{
                Thread.sleep(1000);
                count++;
                System.out.println(this.name + " : " + count);
               // System.out.println("Counter2 : " + count);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}
