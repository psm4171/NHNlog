package org.nhnacademy.th;

public class Main1 {
    public static void main(String [] args){
        Counter counter = new Counter("Counter",0);
       // Counter counter2 = new Counter("Counter2",0);
        CounterThread counterThread = new CounterThread("CounterThread");


        counterThread.start(); // start를 실행시켜주기 위해서는 run이 필요하다.
        // start()라는 메서드를 보면 run이 포함되어 있기 때문에 counterThread에도 run() 메서드를 선언해줘야 함.
        counter.run(); // run()은 counter 클래스 안 run 메서드를 통해 실행됨. while문 안에 있는 run()

    }
}
