package Multithreading.CyclicBarrier;

import java.util.concurrent.*;

public class CyclicBarrierDemo {
    public static void main(String[] args){
        int numberOfService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfService);
        CyclicBarrier barrier = new CyclicBarrier(numberOfService);

        executorService.submit(new dependService(barrier));
        executorService.submit(new dependService(barrier));
        executorService.submit(new dependService(barrier));

        System.out.println("main");
//        executorService.submit(barrier);
//        executorService.submit(barrier);

    }
}

class dependService implements Callable<String>{

    public final CyclicBarrier barrier;

    public dependService(CyclicBarrier barrier){
        this.barrier = barrier;
    }






    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"Service started");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " Waiting for barrier");
        barrier.await();

//        System.out.println("Numbers parties");
//        barrier.await()

        return "";
    }
}

