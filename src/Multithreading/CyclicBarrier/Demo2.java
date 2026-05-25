package Multithreading.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Demo2 {
    public static void main(String[] args) {
        int numberOfService = 4;
        CyclicBarrier barrier = new CyclicBarrier(numberOfService, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystem are up and running. System Started");
            }
        });

        Thread webServerThread = new Thread(new subSystem("Web server", 3000, barrier));
        Thread databaseThread = new Thread(new subSystem("Database Server", 4000, barrier));
        Thread CasheThread = new Thread(new subSystem("CasheThread Server", 5000, barrier));
        Thread MessagingThread = new Thread(new subSystem("MessagingThread Server", 6000, barrier));


        //now start all the thread
        webServerThread.start();
        databaseThread.start();
        CasheThread.start();
        MessagingThread.start();

    }

}
    class subSystem implements Runnable{

        private String name;
        private int initializationTime;
        private CyclicBarrier barrier;

        public subSystem(String name, int initializationTime, CyclicBarrier barrier)
        {
            this.name = name;
            this.initializationTime = initializationTime;
            this.barrier = barrier;
        }

        @Override
        public void run() {
        try {
            System.out.println(name + " Initialization Started");
            Thread.sleep(initializationTime);
            System.out.println(name + "Initialization Complete");
            barrier.await();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    }


