package Volatile_and_Atomic_Example;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    private AtomicInteger counter = new AtomicInteger(0);
   // private int counter = 0;

    public  void increment(){
        int i = counter.incrementAndGet();
    }

    public int getCounter(){
       return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicDemo atomicDemo = new AtomicDemo();

        Thread t1 = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                atomicDemo.increment();
            }
        });

        Thread t2 = new Thread(() ->{
           for(int i = 0; i < 1000; i++){
               atomicDemo.increment();
           }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(atomicDemo.getCounter());
    }
}
