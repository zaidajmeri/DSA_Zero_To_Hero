package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public class cf{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(2000);
                //System.out.println("Worker Thread");
            }catch (Exception e){

            }

            return "OK";
        });

      //  System.out.println("Main");

        //in above program main does not wait for worker thread even if timing given
        //if we want to wait main thread to complete worker thread follow below program


        CompletableFuture<String> f2WaitMainT = CompletableFuture.supplyAsync(()->{

            try {
                Thread.sleep(2000);
                System.out.println("Worker Thread");
            }
           catch (Exception e){

           }
            return "ok";
        });
        f2WaitMainT.get(); //for wait main thread
        System.out.println("main");
    }
}
