package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class cancel {
    public static void main(String[] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
      Future<Integer> future =  service.submit( () -> {
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println("Exception occurred : " + e);
            }
            System.out.println("hello" );
            return 42;
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println("Exception ocurred "  + e);
        }
        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        service.shutdown();
    }
}
