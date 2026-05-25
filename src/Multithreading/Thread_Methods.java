package Multithreading;

import java.io.PrintStream;

public class Thread_Methods extends Thread{

    public Thread_Methods(String name){
       super(name);

    }
    public static void main(String[] args) throws InterruptedException{
        Thread_Methods threadMethod = new Thread_Methods("Zaid");
        threadMethod.start();

        Thread_Methods low = new Thread_Methods("Low Priority");
        Thread_Methods mid = new Thread_Methods("Mid Priority");
        Thread_Methods high = new Thread_Methods("high Priority");

        low.setPriority(Thread.MIN_PRIORITY);
        mid.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        mid.start();
        high.start();
        threadMethod.join();

        for (int i = 0; i <= 5 ; i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

        threadMethod.interrupted();

    }


    @Override
    public void run() {

        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + "- Priority :" + Thread.currentThread().getPriority() + "- count:" + i);
            try {
                Thread.sleep(100);
                System.out.println("Thread is Running...");
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted " + e);

            }
        }
        System.out.println("Thread is running");
    }
}
